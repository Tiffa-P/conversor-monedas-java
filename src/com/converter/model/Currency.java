package com.converter.model;

public enum Currency {
    KRW("Won Coreano"),
    USD("Dólar Estadounidense"),
    COP("Peso Colombiano"),
    JPY("Yen Japonés"),
    MXN("Peso Mexicano"),
    GBP("Libra Esterlina");

    private final String description;

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
