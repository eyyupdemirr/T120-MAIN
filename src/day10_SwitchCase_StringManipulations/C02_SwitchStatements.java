package day10_SwitchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını girin: \n(Pazartesi için 1, Salı için 2...)");
        int gunNumarasi = scanner.nextInt();
        gunNumarasi=gunNumarasi%7;

        switch (gunNumarasi){
            case  1 :
                System.out.println("pazartesi haftaici");
            break;
            case 2:
                System.out.println("sali haftaici");
            break;
            case 3:
                System.out.println("carsamba haftaici");
                break;
            case 4:
                System.out.println("persembe haftaici" );
                break;
            case 5:
                System.out.println("cuma haftaici");
                break;
            case 6:
                System.out.println("cumartesi haftasonu");
                break;
            case 7:
                System.out.println("pazar haftasonu");
                break;
            case 0:
                System.out.println("pazar haftasonu");
                break;
            default:
                System.out.println("gecerli sayi giriniz");
        }





    }
}
