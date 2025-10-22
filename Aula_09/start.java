//Aula 9 -If e Else em Java

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashMap;

public class start {
    public static void main(String[] args) {
        String Chave;

        int pontos = 1000;
        int vida = 4;

        boolean magico = false;

        if (vida == 3 && pontos > 1000) {
            Chave = "Azul";
            System.out.println("Parabéns! Você desbloqueou a Chave " + Chave);
        } else if (vida < 3 || pontos < 1000) {
            Chave = "Verde";
            System.out.println("Parabéns! Você desbloqueou a Chave " + Chave);
        } else if (!magico && pontos == 1000) {
            Chave = "Laranja";
            System.out.println("Parabéns! Você desbloqueou a Chave " + Chave);
        }
    }

}