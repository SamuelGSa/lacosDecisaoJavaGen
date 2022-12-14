package lacoDecisao;

import java.util.Scanner;

public class ex001 {
    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int n1 = entrada.nextInt();
        System.out.println("Informe o segundo valor");
        int n2 = entrada.nextInt();
        System.out.println("Informe o terçeiro valor");
        int n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) System.out.println("O primeiro numero inserido e maior " + n1);
        else if (n3 < n2) System.out.println("O segundo numero inserido é o maior " + n2);
        else System.out.println("O terceiro numero é o maior " + n3);

        System.out.println("Fim do programa");
    }
}