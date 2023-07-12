package com.example.springdemo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class Przedmiot {

    @JsonProperty("Nazwa")
    private String nazwa;

    @JsonProperty("ECTS")
    private Integer ects;

    @JsonProperty("Sala")
    private Integer sala;

    @JsonProperty("Egzamin")
    private String egzamin;

    @JsonProperty("Id")
    private Integer id;

}
