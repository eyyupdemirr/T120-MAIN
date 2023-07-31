package day08_IfElseIfStatement;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {

        // Soru 2 - Kullanicinin kilo(kg) ve boyunu (cm) isteyip
        // vucut kitle endeksini hesaplayin
        //(kilo * 10000 / (boy * boy)) vucut kitle endeksi 30’dan
        // buyukse obez, 25 - 30 arasi ise kilolu, 20 - 25
        //arasi ise normal, 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke=kilo * 10000 / (boy * boy);
        System.out.println(vke);

        if (kilo * 10000 / (boy * boy) > 30) {
            System.out.println("Obez");
        } else if (kilo * 10000 / (boy * boy) > 25) {
            System.out.println("Kilolu");
        } else if (kilo * 10000 / (boy * boy) > 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayif");
        }


        //Scanner scanner=new Scanner(System.in);
        //System.out.println("lutfen kilonuzu giriniz");
        //System.out.println("lutfen boyunuzu giriniz");

        //double kilo=scanner.nextDouble();
        //double boy=scanner.nextDouble();
        //double d=(kilo*10000/boy*boy);
        // System.out.println(d);
        // double e=(kilo*10000/(boy*boy));
        // System.out.println(e);


        // // hocaya sorulacak!!!!!!!!!!


        //if ((kilo * 10000 / (boy * boy))>30) System.out.println("obez");
        //else if ((kilo * 10000 / (boy * boy))>25) System.out.println("kilolu");
        //else if ((kilo*10000/boy*boy)>20) System.out.println("normal");
        //else System.out.println("zayif");


    }
}
