import java.util.Scanner;
public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero1 = inputValue.nextInt();
        System.out.print("Ingrese el numero: ");
        int numero2 = inputValue.nextInt();
        System.out.print("Ingrese el numero: ");
        int numero3 = inputValue.nextInt();
        System.out.print("Ingrese el numero: ");
        int numero4 = inputValue.nextInt();
        if (numero1 == numero2 & numero2 == numero3 & numero3 == numero4) {
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
    }
}
