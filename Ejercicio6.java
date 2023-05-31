import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int salario;
    int suma = 0;
    int mayores = 0;

    for (int i = 1; i <= 10; i++) {
      System.out.println("Ingrese el salario " + i + ": ");
      salario = input.nextInt();
      suma += salario;

      if (salario > 10000) {
        mayores++;
      }
    }

    System.out.println("La suma de los salarios es: " + suma);
    System.out.println("La cantidad de salarios mayores a 10000 colones es: " + mayores);
  }
}