package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TestApi {
    @Autowired
    private PrzedmiotyBaza przedmiotyBaza;

    @PostMapping(value = "przedmioty", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void dodajPrzedmiot(@RequestBody Przedmiot przedmiot) { przedmiotyBaza.dodajPrzedmiot(przedmiot); }

    @GetMapping(value = "przedmioty", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Przedmiot> getPrzedmiot(
            @Nullable @RequestParam("sala") Integer sala,
            @Nullable @RequestParam("egzamin") String egzamin
    ) {
        return przedmiotyBaza.getPrzedmiotyWszystkie(sala, egzamin);
    }

    @GetMapping(value = "przedmioty/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getPrzedmiot(@PathVariable("id") Integer id) {
        Przedmiot przedmiot = przedmiotyBaza.getPrzedmiot(id);

        if (przedmiot == null) {
            String blad = "Brak-przedmiotu-o-takim-id.";
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(blad);

        }

        return ResponseEntity.ok(przedmiot);
    }

    @DeleteMapping(value = "przedmioty/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity usunPrzedmiot(@PathVariable("id") Integer id) {
        if (przedmiotyBaza.usunPrzedmiot(id)) {
            return ResponseEntity.ok().build();
        }
        String blad = "Brak-przedmiotu-o-takim-id.";
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(blad);
    }

    @DeleteMapping(value = "przedmioty", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void usunPrzedmioty() {
        przedmiotyBaza.usunPrzedmiot();
    }
}