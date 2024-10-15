import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero binario: ");
        String binario = sc.nextLine();
        int resultado = 0;
        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1') {
                resultado = (int) (resultado + Math.pow(2, binario.length() -1 - i));
            }
        }
        System.out.println(resultado);
    }
}