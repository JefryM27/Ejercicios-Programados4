import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int adivine;
    int contador = 0;

    System.out.print("Ingrese un número para adivinar: ");
    adivine = input.nextInt();

    do {
      System.out.print("Ingrese un número: ");
      num = input.nextInt();
      contador++;

      if (num > adivine) {
        System.out.println("El número es menor.");
      } else if (num < adivine) {
        System.out.println("El número es mayor.");
      }
    } while (num != adivine);

    System.out.println("¡Adivinaste el número en " + contador + " intentos!");
  }
}