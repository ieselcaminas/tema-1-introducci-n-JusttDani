package Pruebas_examen;

import java.util.Scanner;

public class Prueba19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("Ingrese el precio hora: ");
        double preciohora = sc.nextDouble();
        double impuestos = 0;
        double bruto;
        if (horas < 35){
            bruto = (int) (horas * preciohora);
        }
        else{
            bruto = (int) ((35 * preciohora) + (horas-35)*(preciohora*1.5));
        }
        System.out.println(bruto);
        if (bruto > 900){
            impuestos = ((bruto - 900)*0.45) + (400*0.25);
        }
        if (bruto > 500 && bruto < 900) {
            impuestos = ((bruto - 500) * 0.25);
        }

        System.out.println("El sueldo bruto es " + bruto);
        System.out.println("El sueldo neto es " + (bruto - impuestos));
        System.out.println("Los impuestos son " + impuestos);
    }
}