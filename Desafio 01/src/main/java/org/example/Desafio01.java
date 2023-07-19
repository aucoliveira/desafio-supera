package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, informe a quantidade de números que deseja inserir: ");
        int quantidadeNumeros = scan.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();


        int count = 0;

        while (count < quantidadeNumeros) {

            System.out.println("Informe o valor, lembrando que não pode ser negativo: ");
            int num = scan.nextInt();

            if (num > 0 ) {
                if ( num % 2 == 0) {
                    pares.add(num);
                }else {
                    impares.add(num);
                }
                count++;
            } else {
                System.out.println("Digite um número positivo!");
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        numeros.addAll(pares);
        numeros.addAll(impares);

        System.out.println("testando: " +numeros);

        for( int num : numeros) {
            System.out.println(num);
        }


    }
}