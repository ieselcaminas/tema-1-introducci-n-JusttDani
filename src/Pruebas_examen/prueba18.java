package Pruebas_examen;

import java.util.Scanner;

public class prueba18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese horas");
        int horas = sc.nextInt();
        System.out.println("Ingrese minutos");
        int minutos = sc.nextInt();
        System.out.println("Ingrese segundos");
        int segundos = sc.nextInt();

        if (segundos == 59) {
            if (minutos == 59) {
                horas++;
                minutos = 0;
            }else{
                minutos++;
            }
            segundos = 0;
        }else{
            segundos++;
        }
        System.out.println(horas + "h:" + minutos + "m:" + segundos +"s");
    }
}