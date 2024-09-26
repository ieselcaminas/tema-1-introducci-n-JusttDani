import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero = inputValue.nextInt();;
        for( int i = 1; i <= numero / 2 ; i++ ){
            if( numero % i == 0) {
                System.out.println("Un divisor de " +numero +" es "+i);
            }
        }
        System.out.println("Un divisor de " +numero +" es "+ numero);
    }
}
