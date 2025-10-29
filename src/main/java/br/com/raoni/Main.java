package br.com.raoni;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int [] lista = {5, 3, 4, 1, 2};

        System.out.println("Lista Original: " + Arrays.toString(lista));

        System.out.println("-----------------------------------");

        for (int i = 0; i < lista.length - 1; i++) {

            for (int j = 0; j < lista.length - 1 - i; j++) {

                if (lista[j] > lista[j + 1]) {

                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;

                }
            }

            System.out.println("Após a passagem " + (i + 1) + ": " + Arrays.toString(lista));

        }

        System.out.println("-----------------------------------");
        System.out.println("Lista Ordenada: " + Arrays.toString(lista));
    }
}