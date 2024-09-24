import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo = 1;
        int numero = 1;
        while(numero != 0){
            numero = sc.nextInt();
            if(numero > 0){
                positivo++;
            }
        }
        System.out.println("Hay " + positivo+" positivos");

    }
}
.
