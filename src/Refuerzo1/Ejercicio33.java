package Refuerzo1;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divi = 0;
        while (num > 10) {
            divi = num % 10 + divi;
            num = num / 10;
        }
        System.out.println(num + divi);
    }
}