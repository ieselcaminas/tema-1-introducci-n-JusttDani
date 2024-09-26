import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero = inputValue.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = inputValue.nextInt();
        while (numero >= numero2) {
            numero = numero - numero2;
        }
        System.out.println("El resto es " + numero);
    }
}
