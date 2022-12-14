package lacoDecisao;

import java.util.Scanner;

//4-Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

public class ex004 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int numero = entrada.nextInt();

        if (numero%2 == 0)System.out.println("O número: " + numero + " é par e a sua raiz quadrada é: " + Math.sqrt(numero));
        else System.out.println("O número: " + numero + " é impar e elevado ao quadrado é: " + Math.pow(numero,2));
    }
}