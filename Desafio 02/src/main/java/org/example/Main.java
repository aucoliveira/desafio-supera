package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o um valor: ");
        BigDecimal valor = scan.nextBigDecimal();
        calculaQtdNotasMoedas(valor);

    }
    public static void calculaQtdNotasMoedas(BigDecimal valor){
        BigDecimal qtdCem;
        BigDecimal subtracao;
        BigDecimal novoValor;
        BigDecimal qtdCinquenta;
        BigDecimal qtdVinte;
        BigDecimal qtdDez;
        BigDecimal qtdCinco;
        BigDecimal qtdDois;
        BigDecimal qtdMoedaUm;
        BigDecimal qtdMoedaCiquenta = new BigDecimal(0.00);
        BigDecimal qtdMoedaVinteCinco = new BigDecimal(0.00);;
        BigDecimal qtdMoedaDez = new BigDecimal(0.00);;
        BigDecimal qtdMoedaCinco = new BigDecimal(0.00);;
        BigDecimal qtdMoedaUmCentavo = new BigDecimal(0.00);;

        qtdCem = valor.divideToIntegralValue(new BigDecimal(100));
        subtracao = qtdCem.multiply(new BigDecimal("100"));
        novoValor = valor.subtract(subtracao);

        qtdCinquenta = novoValor.divideToIntegralValue(new BigDecimal("50"));
        novoValor = novoValor.subtract(new BigDecimal("50"));

        qtdVinte = novoValor.divideToIntegralValue(new BigDecimal("20"));
        subtracao = qtdVinte.multiply(new BigDecimal("20"));
        novoValor = novoValor.subtract(subtracao);

        qtdDez = novoValor.divideToIntegralValue(new BigDecimal("10"));
        subtracao = qtdDez.multiply(new BigDecimal("10"));
        novoValor = novoValor.subtract(subtracao);

        qtdCinco = novoValor.divideToIntegralValue(new BigDecimal("5"));
        subtracao = qtdCinco.multiply(new BigDecimal("5"));
        novoValor = novoValor.subtract(subtracao);

        qtdDois = novoValor.divideToIntegralValue(new BigDecimal("2"));
        subtracao = qtdDois.multiply(new BigDecimal("2"));
        novoValor = novoValor.subtract(subtracao);


        qtdMoedaUm = novoValor.divideToIntegralValue(new BigDecimal("1"));
        subtracao = qtdMoedaUm.multiply(new BigDecimal("1"));
        novoValor = novoValor.subtract(subtracao);

        qtdMoedaCiquenta = novoValor.divideToIntegralValue(new BigDecimal("0.50"));
        subtracao = qtdMoedaCiquenta.multiply(new BigDecimal("0.50"));
        novoValor = novoValor.subtract(subtracao);

        if (novoValor.compareTo(new BigDecimal("0.25")) >= 0.25){
            qtdMoedaVinteCinco = novoValor.divideToIntegralValue(new BigDecimal("0.25"));
            subtracao = qtdMoedaUm.multiply(new BigDecimal("0.25"));
            novoValor = novoValor.subtract(subtracao);
        }

        if (novoValor.compareTo(new BigDecimal("0.10")) >= 0.10) {
            qtdMoedaDez = novoValor.divideToIntegralValue(new BigDecimal("0.10"));
            subtracao = qtdMoedaDez.multiply(new BigDecimal("0.10"));
            novoValor = novoValor.subtract(subtracao);
        }

        if ( novoValor.compareTo(new BigDecimal("0.05")) >= 0.05) {
            qtdMoedaCinco = novoValor.divideToIntegralValue(new BigDecimal("0.05"));
            subtracao = qtdMoedaCinco.multiply(new BigDecimal("0.05"));
            novoValor = novoValor.subtract(subtracao);
        }

        if ( novoValor.compareTo(new BigDecimal("0.01")) >= 0.01) {
            qtdMoedaUmCentavo = novoValor.divideToIntegralValue(new BigDecimal("0.01"));
            subtracao = qtdMoedaUmCentavo.multiply(new BigDecimal("0.01"));
            novoValor = novoValor.subtract(subtracao);
        }

        System.out.println("Notas: ");
        System.out.println(qtdCem.intValue()+"  nota(s) de R$ 100.00 ");
        System.out.println(qtdCinquenta.intValue()+"  nota(s) de R$ 50.00 ");
        System.out.println(qtdVinte.intValue()+"  Nota(s) de R$ 20.00");
        System.out.println(qtdDez.intValue()+"  Nota(s) de R$ 10.00");
        System.out.println(qtdCinco.intValue()+"  Nota(s) de R$ 5.00");
        System.out.println(qtdDois.intValue()+"  Nota(s) de R$ 2.00");
        System.out.println("Moedas: ");
        System.out.println(qtdMoedaUm.intValue()+"  Moeda(s) de R$ 1.00");
        System.out.println(qtdMoedaCiquenta.intValue()+"  Moeda(s) de R$ 0.50");
        System.out.println(qtdMoedaVinteCinco.intValue()+"  Moeda(s) de R$ 0.25");
        System.out.println(qtdMoedaDez.intValue()+"  Moeda(s) de R$ 0.10");
        System.out.println(qtdMoedaCinco.intValue()+"  Moeda(s) de R$ 0.05");
        System.out.println(qtdMoedaUmCentavo.intValue()+"  Moeda(s) de R$ 0.01");
    }
}