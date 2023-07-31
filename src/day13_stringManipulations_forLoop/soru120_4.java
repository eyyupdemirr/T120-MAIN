package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class soru120_4 {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //        basariyla kaydedildi" yazdirin
        //        - ilk harf kucuk harf olmali
        //        - son karakter rakam olmali
        //        - sifre bosluk icermemeli
        //        - uzunlugu en az 10 karakter olmali
        //         */
        //        Scanner scanner=new Scanner(System.in);
        //        System.out.println("Şifrenizi giriniz.");
        //        String sifre=scanner.nextLine();

        //        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) {
        //            System.out.println("ilk harf kucuk harf olmali");
        //        }
        //        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
        //            System.out.println("son karakter rakam olmali");
        //        }
        //        if (sifre.contains(" ")) {
        //            System.out.println("sifre bosluk icermemeli");
        //        }
        //        if (sifre.length()<10) {
        //            System.out.println("uzunlugu en az 10 karakter olmali");
        //        }
        //        else {
        //            System.out.println("sifre basariyla kaydedildi");
        //        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre=scanner.nextLine();
        if (!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z'))
            System.out.println("ilk harf kucuk harf olmali");
       // if (!(sifre.charAt(9)>='0'&&sifre.charAt(9)<='9'))
          if (!(sifre.charAt(sifre.length()-1)>='0'&& sifre.charAt(sifre.length()-1)<='9'))
           System.out.println("son karakter rakam olmali");
        if (sifre.contains(" "))
            System.out.println("sifre bosluk icermemeli");
        if (sifre.length()<10)
            System.out.println("uzunlugu en az 10 karakter olmali");

       // if (sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')
         //   System.out.println("debeeme");
       // if (sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')
            System.out.println("sonrakam  sayiiiii");

            //if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
        //            System.out.println("İlk harf Küçük olmalı");
        //
        //        } if (!(sonKrktr >= '0' && sonKrktr <= '9')) {
        //            System.out.println("Son karakter rakam olmalı");
        //
        //        } if (sifre.contains(" ")) {
        //            System.out.println("Şifre boşluk içermemeli");
        //
        //        } if (!(sifre.length() >= 10)) {
        //            System.out.println("Uzunlugu en az 10 karakter olmalı");
        //
        //        } else  {
        //            System.out.println("Şifre başarıyla kaydedildi!");




    }
}
