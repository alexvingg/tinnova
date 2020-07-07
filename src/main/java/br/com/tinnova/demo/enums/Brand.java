package br.com.tinnova.demo.enums;

import lombok.Getter;

@Getter
public enum Brand {

    GM("Gm"),
    VW("Volksvagem"),
    HONDA("Honda"),
    TOYOTA("Toyota"),
    BMW("Bmw"),
    MERCEDES("Mercedes"),
    FIAT("Fiat"),
    FORD("Ford");

    private String name;

    Brand(String name) {
        this.name = name;
    }
}
