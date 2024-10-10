import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num1 = entrada.nextInt();
        int numero = 1;
        if (num1 == 2) {
            System.out.println("El numero es primo");
            System.exit(1);
        }
        if (num1%2 != 0) {

            for (int i = 3;i<num1;i+=2){
                if(num1%i == 0) {
                    System.out.println("El numero no es primo");
                    System.exit(1);
                }
            }
            numero = 0;
        }
        if (numero == 0) {
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }
    }
}