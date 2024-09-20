import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        double sueldobruto;
        double impuestos;
        double neto = 0.00;
        double impuesto2 = 0.00;
        System.out.println("Ingrese horas trabajadas : ");
        int horas = inputValue.nextInt();
        System.out.println("Ingrese el precio de las horas : ");
        double precio = inputValue.nextDouble();
        if (horas > 35){
            sueldobruto = (precio * 35);
            horas = horas - 35;
            sueldobruto = sueldobruto + horas * 1.5 * precio;
        }
        else{
            sueldobruto = (precio * horas);
        }
        System.out.println("Sueldo antes de impuestos: " + sueldobruto);
        if (sueldobruto > 900) {
            impuestos = sueldobruto - 900;
            neto = impuestos * 0.55;
            sueldobruto = sueldobruto - impuestos;
            impuesto2 = impuestos;
        }
        if(sueldobruto > 500) {
            impuestos = sueldobruto - 500;
            neto = 500 + neto + impuestos * 0.75;
        }else{
            neto = sueldobruto;
        }
        impuestos = impuesto2 + sueldobruto - neto;
        System.out.println("Sueldo neto: " + neto + "Impuestos: " + impuestos);
    }
}
