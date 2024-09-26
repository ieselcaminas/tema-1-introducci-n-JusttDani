package Refuerzo1;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese 3 numeros: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        if (numero1 + numero2 == numero3){
            System.out.println("True");
        }
    }
}
