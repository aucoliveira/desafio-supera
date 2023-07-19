package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o tamanho do Array: ");
        int tamanhoArray = scan.nextInt();
        System.out.println("Informe o valor alvo: ");
        int num = scan.nextInt();

        int [] array = new int[tamanhoArray];

        System.out.println("informe os elementos do Array de tamanho "+tamanhoArray);
        for (int i =0; i < tamanhoArray; i++) {
            array[i] = scan.nextInt();
        }

        int count = paresEDiferentes(array, num);
        System.out.println(count);
    }

    public static int paresEDiferentes(int[] array, int num) {
        Set<Integer> numeros = new HashSet<>();
        int count = 0;
        for (int i : array ) {
            if (numeros.contains(i - num) ) {
                count++;
            }
            if (numeros.contains(i + num)) {
                count++;
            }
            numeros.add(i);

        }
        return count;
    }
}