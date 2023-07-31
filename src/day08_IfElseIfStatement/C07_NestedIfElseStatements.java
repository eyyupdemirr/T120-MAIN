package day08_IfElseIfStatement;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir”
        // yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyet Erkek='E', Kadin='K'");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 100) {
                System.out.println("gcersiz yas girisi");
            } else if (yas >= 65) {
                System.out.println("Emekli olabilir");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin  " + (65 - yas) + " yil daha calismalisiniz");

            }

        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 100) {
                System.out.println(" kadin gecersiz yas ");
            } else if (yas > 60) {
                System.out.println("kadin emekli olabilr");
            } else if (yas < 60) {
                System.out.println("kadin emekli olamaz  " + (60 - yas) + "   yil calismak gerek");
            }

        } else System.out.println("gecersiz cinsiyet");


        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Cinsiyet girirniz E=Erkek,K=kadin");
        //char cinsiyet=scanner.next().toUpperCase().charAt(0);

        //System.out.println("lutfen yasinizi girirniz");
        //double yas=scanner.nextDouble();

        //if (cinsiyet=='E'){
        //    if (yas>100||yas<0) {
        //        System.out.println("Gecersiz  yas girisi");
        //    } else if (yas>=65) {
        //        System.out.println("Erkek emekli olabilir");
        //    }else
        //        System.out.println("Emekli olamazsiniz "+(65-yas)+" yil daha calismaniz gerekir");

        //} else if (cinsiyet=='K') {
        //    if (yas>100||yas<0){
        //        System.out.println("Gecersiz  yas girisi");
        //    } else if (yas>=60) {
        //        System.out.println("Kadin emekli olabilir");
        //    }else
        //        System.out.println("Emekli olamazsiniz "+(60-yas)+" yil daha calismaniz gerekir");

        //}else System.out.println("Gecersiz cinsiyet");


    }
}
