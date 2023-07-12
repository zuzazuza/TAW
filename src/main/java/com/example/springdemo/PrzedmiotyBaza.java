package com.example.springdemo;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class PrzedmiotyBaza {
    private List<Przedmiot> przedmiotyWszystkie = new ArrayList<>();

    private int idPrzedmiot = 1;

    public List<Przedmiot> getPrzedmiotyWszystkie(Integer sala, String egzamin) {
        if (sala == null && egzamin == null) {
            return przedmiotyWszystkie;
        }
        List<Przedmiot> przedmiotyWybrane = new ArrayList<>();
        for (Przedmiot przedmiot : przedmiotyWszystkie) {
            if (sala == null && przedmiot.getEgzamin().equals(egzamin)
                    || egzamin == null && przedmiot.getSala().equals(sala)
                    || przedmiot.getEgzamin().equals(egzamin) && przedmiot.getSala().equals(sala)
            ) {
                przedmiotyWybrane.add(przedmiot);
            }
        }
        return przedmiotyWybrane;
    }

    public void dodajPrzedmiot(Przedmiot przedmiot) {
        przedmiot.setId(idPrzedmiot);
        idPrzedmiot++;
        przedmiotyWszystkie.add(przedmiot);
    }

    public void usunPrzedmiot() {
        przedmiotyWszystkie.clear();
    }

    public Przedmiot getPrzedmiot(Integer id) {
        for (Przedmiot przedmiot : przedmiotyWszystkie) {
            if (przedmiot.getId().equals(id)) {
                return przedmiot;
            }
        }
        return null;
    }

    public Boolean usunPrzedmiot(Integer id) {
        Przedmiot przedmiotUsuwany = null;
        for (Przedmiot przedmiot : przedmiotyWszystkie) {
            if (przedmiot.getId().equals(id)) {
                przedmiotUsuwany = przedmiot;
            }
        }

        if (przedmiotUsuwany == null) {
            return false;
        }
        przedmiotyWszystkie.remove(przedmiotUsuwany);
        return true;
    }
}
