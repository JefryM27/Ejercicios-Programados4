import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
   int num;
   int contador = 0;

   do{
    System.out.println("ingrese un numero");
    num =input.nextInt();
    contador ++;
   } while (num >=0);
   System.out.println("La cantidad de numeros es de..." + (contador -1 ));
    }
}
