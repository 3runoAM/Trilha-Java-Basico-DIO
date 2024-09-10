package CalculandoConsumoELimiteDeDados;

import java.util.Arrays;
import java.util.Scanner;

public class CalculandoConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] consumoSemanal = input.split(",");

        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        System.out.println("Total mensal: " + totalConsumo + " MB");

        System.out.println("Media semanal: " + mediaSemanal + " MB");

        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);

        scanner.close();
    }

    public static int calcularConsumoTotal(String[] consumoSemanal) {
        return Arrays.stream(consumoSemanal)
                .mapToInt(Integer::valueOf)
                .sum();
    }


    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo / numeroDeSemanas;
    }

    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int max = Arrays.stream(consumoSemanal)
                .mapToInt(Integer::valueOf)
                .max()
                .getAsInt();

        for (int i = 0; i < consumoSemanal.length; i++){
            if (consumoSemanal[i].equals(String.valueOf(max))){
                return i+1;
            }
        }
        return -1;
    }
}