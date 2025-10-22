//Aula 10 - While Loop em Java

import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashMap;

public class start {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = teclado.nextInt();
        int aux = num;

        while (num > 0) {
            if (num > 1) {
                System.out.println(num + " patinhos foram passear");
            } else {
                System.out.println(num + " patinho foi passear");
            }
            System.out.println("Além das montanhas para brincar");
            System.out.println("A mamãe gritou: quá, quá, quá, quá");
            if (num == 2) {
                System.out.println("Mas só um  patinho voltol de lá");
            } else if (num == 1) {
                System.out.println("Mas nenhum patinho voltou de lá");
            } else {
                System.out.println("Mas só " + (num - 1) + " patinhos voltaram de lá");
            }
            num--;
        }

        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas para brincar");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: quá, quá, quá, quá");
        System.out.println("A mamãe gritou: quá, quá, quá, quá");
        System.out.println("E os " + aux + " patinhos voltaram de lá");
        teclado.close();

    }
}