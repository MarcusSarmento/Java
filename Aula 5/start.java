import java.util.Scanner;

public class start{
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      /*
       * System.out.print("Qual sua idade: ");
       * int idade = teclado.nextInt();
       * System.out.println("Sua idade é: " + idade);
       * 
       * System.out.print("Qual sua altura: ");
       * double altura = teclado.nextDouble();
       * System.out.println("Sua altura é: " + altura);
       * 
       * System.out.print("Qual seu nome: ");
       * String nome = teclado.next();
       * System.out.println("Seu nome é: " + nome);
       * 
       * System.out.print("Estou vivo? (true ou false) ");
       * boolean vivo = teclado.nextBoolean();
       * System.out.println("Estou vivo? " + vivo);
       */

      // exercício

      System.out.println("Digite um valor para saber a menor quanridade de notas: ");
      int valor = teclado.nextInt();

      int notas100 = valor / 100;
      valor = valor - (notas100 * 100);

      int notas50 = valor / 50;
      valor = valor - (notas50 * 50);

      int notas20 = valor / 20;
      valor = valor - (notas20 * 20);

      int notas10 = valor / 10;
      valor = valor - (notas10 * 10);

      int notas5 = valor / 5;
      valor = valor - (notas5 * 5);

      int notas2 = valor / 2;
      valor = valor - (notas2 * 2);

      System.out.println("Notas de 100: " + notas100);
      System.out.println("Notas de 50: " + notas50);
      System.out.println("Notas de 20: " + notas20);
      System.out.println("Notas de 10: " + notas10);
      System.out.println("Notas de 5: " + notas5);
      System.out.println("Notas de 2: " + notas2);

      teclado.close();
  }
}