package Refuerzo1;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            int M = sc.nextInt();
            if (M < 3) {
                System.out.println("NO");
            }else{
                System.out.println(M/4);
            }
            }
        }


    }
