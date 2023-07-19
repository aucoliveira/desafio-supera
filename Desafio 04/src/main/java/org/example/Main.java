package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de frases: ");
        int qtd = scan.nextInt();
        scan.nextLine();

        List<String> frases = new ArrayList<>();
        int count = 0;

        while (count < qtd) {
            System.out.println("Informe uma palavra: ");
            String frase = scan.nextLine();
            frases.add(frase);
            count++;
        }
        List<String> novasFrases = desembaralhaLista(frases);
        for (String frase : novasFrases) {
            System.out.println(frase);
        }
    }
    public static List<String> desembaralhaLista(List<String> list) {
        List<String> novaLista = new ArrayList<>();

        for (String frase : list) {
            int tamanho = frase.length() / 2;
            if (frase.length() % 2 != 0) {
                tamanho++;
            }
            String frase1 = frase.substring(0, tamanho);
            String frase2 = frase.substring(tamanho);
            novaLista.add(desembaralhaFrase(frase1) + desembaralhaFrase(frase2));
        }
        return novaLista;
    }

    public static String desembaralhaFrase(String frase) {

        char[] arrayChar = frase.toCharArray();
        int i = 0;
        int j = arrayChar.length -1;
        while (i < j) {
            char temp = arrayChar[i];
            arrayChar[i] = arrayChar[j];
            arrayChar[j] = temp;
            i++;
            j--;
        }

        String novaFrase = new String(arrayChar);

        return novaFrase;
    }
}