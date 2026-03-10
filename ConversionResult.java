package com.converter.model;

public record ConversionResult(
    Currency from, 
    Currency to, 
    double amount, 
    double result
) {
    @Override
    public String toString() {
        return String.format("%.2f %s (%s) equivalen a %.2f %s (%s)", 
            amount, from, from.getDescription(), result, to, to.getDescription());
    }
}
