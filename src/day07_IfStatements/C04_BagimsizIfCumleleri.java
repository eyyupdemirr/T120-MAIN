package day07_IfStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tam sayi giriniz");
        int girilensayi = scanner.nextInt();

        if (girilensayi % 3 == 0) {
            System.out.println(" Sayi 3 e tam bolunuyor");
        }
        if (girilensayi % 5 == 0) {
            System.out.println(" Sayi 5 e tam bolunuyor");
        }









        //Scanner scanner=new Scanner(System.in);

        //System.out.println("lutfen ucgen kenarlarini giriniz");

        //double kenar1=scanner.nextDouble();

        //double kenar2=scanner.nextDouble();

        //double kenar3=scanner.nextDouble();

        //if (kenar1==kenar2&&kenar1==kenar3)
        //    System.out.println("Eskenar ucgen");
        //    else
        //    System.out.println("Eskenar degil");


    }
}
