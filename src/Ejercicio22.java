import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        int numero;
        int positivos  =  0;
        for( int i = 0; i < 10; i++ ){
            numero = inputValue.nextInt();
            if(numero > 0){
                positivos++;
            }
        }
        System.out.println("Hay " + positivos + " positivos");
    }
}
