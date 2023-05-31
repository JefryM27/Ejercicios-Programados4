import java.util.Scanner;

public class Ejercicio5 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Ingrese un número: ");
   int numero = input.nextInt();

    for (int i = 1; i <= numero; i++) {
      System.out.println(i);
    }
  }
}