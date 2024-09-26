import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        String res = "";
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero = inputValue.nextInt();;
        for( int i = 1; i <= numero; i++ ){
            res = res + i + " ";
            System.out.println(res);
        }
    }
}