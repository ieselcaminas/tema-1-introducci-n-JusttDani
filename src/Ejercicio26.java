import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero = inputValue.nextInt();;
        for( int i = 1; i < 11; i++ ){
            System.out.println(numero + " x " + i + " = " + numero* i);
        }
    }
}

