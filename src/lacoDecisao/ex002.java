package lacoDecisao;

import java.util.Arrays;
import java.util.Scanner;

//2- Faça um programa que entre com três números e coloque em ordem crescente.

public class ex002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int n1 = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        int n2 = entrada.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int n3 = entrada.nextInt();

        int[] arrayNum = {n1, n2, n3};
        Arrays.sort(arrayNum);

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Ordem crescente: " + arrayNum[i]);
        }
    }

}