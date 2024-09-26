package Refuerzo1;

import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            }else {
                n = n * 3 + 1;
            }
            System.out.println(n);
        }
    }
}
