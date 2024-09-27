import java.util.Scanner;

public class Refuerzo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dia: ");
        int n = sc.nextInt();
        System.out.println("Introduzca el mes: ");
        int m = sc.nextInt();
        switch (m){
            case 1:
                m = 0;
                break;
                case 2:
                    m = 31;
                    break;
                    case 3:
                        m = 59;
                        break;
                        case 4:
                            m = 90;
                            break;
                            case 5:
                                m = 120;
                                break;
                                case 6:
                                    m = 151;
                                    break;
                                    case 7:
                                        m = 181;
                                        break;
                                        case 8:
                                            m = 212;
                                            break;
                                            case 9:
                                                m = 243;
                                                break;
                                                case 10:
                                                    m = 273;
                                                    break;
                                                    case 11:
                                                        m = 304;
                                                        break;
                                                        case 12:
                                                            m = 334;
                                                            break;
        }

        System.out.println("Faltan " + (365 - m - n ) + " dias");
    }
}
