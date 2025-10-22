//Aula 7 - ArrayList em Java

//import java.util.Scanner;
//import java.util.Arrays;
import java.util.ArrayList;

public class start {
    public static void main(String[] args) {
        ArrayList<String> naTela = new ArrayList<String>();

        naTela.add("Vingadores");
        naTela.add("Batman");
        naTela.add("Homem Aranha");
        System.out.println(naTela);

        naTela.remove("Homem Aranha");
        System.out.println(naTela);

        naTela.add("Avatar");
        System.out.println(naTela);
        
    }

    
}