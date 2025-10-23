//Aula 12 e 13- Funções em Java pt.1

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashMap;
import java.lang.Math;

public class start {

    static double calculaMenorRaiz(double a, double b, double c) {
        double raiz;

        double raiz1 = (-b + Math.sqrt(delta(a, b, c))) / (2 * a);
        double raiz2 = (-b - Math.sqrt(delta(a, b, c))) / (2 * a);

        if (raiz1 < raiz2) {
            raiz = raiz1;
        } else {
            raiz = raiz2;
        }

        return raiz;
    }

    static double delta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = -6;

        double resultado = calculaMenorRaiz(a, b, c);
        System.out.println("A menor raiz é: " + resultado);
    }
}
