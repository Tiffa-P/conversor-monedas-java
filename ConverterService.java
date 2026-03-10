package com.converter.service;

import com.converter.model.Currency;
import com.converter.model.ConversionResult;
import java.util.Map;

public class ConverterService {
    // Tasas base (1 USD = X moneda) - Valores aproximados
    private final Map<Currency, Double> rates = Map.of(
        Currency.USD, 1.0,
        Currency.KRW, 1315.50,
        Currency.COP, 3950.00,
        Currency.JPY, 150.25,
        Currency.MXN, 17.10,
        Currency.GBP, 0.79
    );

    public ConversionResult convert(Currency from, Currency to, double amount) {
        double amountInUsd = amount / rates.get(from);
        double convertedAmount = amountInUsd * rates.get(to);
        return new ConversionResult(from, to, amount, convertedAmount);
    }
}
