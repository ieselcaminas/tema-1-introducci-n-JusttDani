import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu palabra: ");
        String palabra = sc.nextLine();
        int longitud = palabra.length()-1;
        while (longitud == -1) {
            System.out.println("No hay palabra travieso, dame otra");
            palabra = sc.nextLine();
            longitud = palabra.length() - 1;
        }
        for (int i = 0; i < longitud; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i)) {
                System.out.println("No es palindromo ");
                System.exit(1);
            }
        }
        System.out.println("Es palindromo");
    }
}
