package com.converter;

import com.converter.model.Currency;
import com.converter.service.ConverterService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConverterService service = new ConverterService();

        System.out.println("=== BIENVENIDO AL CONVERSOR DE MONEDAS ===");
        
        try {
            System.out.print("Monto a convertir: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.println("Desde (USD, KRW, COP, JPY, MXN, GBP):");
            Currency from = Currency.valueOf(scanner.nextLine().toUpperCase());

            System.out.println("Hacia (USD, KRW, COP, JPY, MXN, GBP):");
            Currency to = Currency.valueOf(scanner.nextLine().toUpperCase());

            var result = service.convert(from, to, amount);
            System.out.println("\n>>> " + result);

        } catch (Exception e) {
            System.out.println("Error: Verifique que la moneda sea válida y use números para el monto.");
        } finally {
            scanner.close();
        }
    }
}
