import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int numero = inputValue.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = inputValue.nextInt();
        int resultado = 0;
        if (numero >= numero2) {
            for (int i = 1; i <= numero2; i++) {
                resultado = resultado + numero;
            }
        } else {
            for (int i = 1; i <= numero; i++) {
                resultado = resultado + numero2;
            }
            System.out.println(resultado);
        }
    }
}
