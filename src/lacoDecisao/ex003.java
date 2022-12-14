package lacoDecisao;

import java.util.Scanner;

//3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
        //categoria ela se encontra:
       // 10-14 infantil
       // 15-17 juvenil
       // 18-25 adulto

public class ex003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 10 && idade <=14) System.out.println("Categoria: Infantil");
        else if (idade >= 15 && idade <=17) System.out.println("Categoria: Juvenil");
        else if (idade >= 18 && idade <=25) System.out.println("ACategoria: dulto");
        else System.out.println("Idade não catalogada. Tente novamente");

    }
}