package Refuerzo1;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        int N = sc.nextInt();
        System.out.print("Cuantos pares quieres: ");
        int M = sc.nextInt();
        if (N % 2 != 0) {
            N = N + 1;
            System.out.println(N);
            for (int i = 1; i <= M - 1; i++) {
                N = N + 2;
                System.out.println(N);
            }
        } else {
            for (int i = 1; i <= M; i++) {
                N = N + 2;
                System.out.println(N);
            }
        }
    }
}
