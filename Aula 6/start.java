//import java.util.Scanner;
import java.util.Arrays;

public class start{
  public static void main(String[] args) {
      String player[] = {"Mario", "Luigi", "Kirby"};
      System.out.println( Arrays.toString(player));

      player[2] = "Yoshi";
      System.out.println( Arrays.toString(player));

  }
}