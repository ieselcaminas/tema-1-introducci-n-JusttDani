import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());
        int secreto = rand.nextInt(100);
        System.out.println("Adivina el numero");
        int n = sc.nextInt();
        do {
            if (secreto < n) {
                System.out.println("Tira hacia bajo");
                n = sc.nextInt();
                if(n== -1){
                    break;
                }
            }
            if (secreto > n) {
                System.out.println("Tira hacia arriba");
                n = sc.nextInt();
                if(n== -1){
                    break;
                }
            }
            if (secreto == n) {
                System.out.println("Acertaste!");
            }
        }while (secreto != n);
    }
}
