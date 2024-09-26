import java.util.Scanner;
public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        double numero1 = inputValue.nextDouble();
        System.out.print("Ingrese el numero: ");
        double numero2 = inputValue.nextDouble();
        if (numero1 > 0 & numero1 < 1 & numero2 > 0 & numero2 < 1) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}