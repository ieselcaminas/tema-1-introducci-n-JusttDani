package Refuerzo1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Dist = 1; //m
        double M = 1; //Kh
        double T = 1; // s
        while (Dist != 0 && M != 0 && T != 0 ) {
             Dist = sc.nextInt();
             M = sc.nextInt();
             M = (M / 3.6);
             T = sc.nextInt();
             if (Dist/T > M ) {
                 System.out.println("Multado");
             }else{
                 System.out.println("Multade'nt");
             }
        }
    }
}
