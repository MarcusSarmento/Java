//Aula 8 - HashMap em Java

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.HashMap;

public class start {
    public static void main(String[] args) {
        HashMap<Integer, String> empresa = new HashMap<>();
        empresa.put(1 , "Administrativo");
        empresa.put(2 , "Financeiro");
        empresa.put(3 , "RH");
        empresa.put(4 , "Operacional");
        empresa.put(5, "Manutenção");
        empresa.put(6, "Marketing");

        empresa.replace(4, "Operações");

        System.out.println("Empresa: " + empresa);
 
        
    }

    
}