import java.util.Scanner;
public class Ejercicio1{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
       int cuadrado;
       int num;
       do {
           System.out.println("Ingrese un numero");
           num = input.nextInt();
            cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es..."+cuadrado);
        } while (num >=0);
        System.out.println("El numero ingresado esta fuera de mis parametros...FIN DEL PROGRAMA");
        
    }
}