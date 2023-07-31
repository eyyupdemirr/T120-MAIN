package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {
        //   Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglanincaya kadar tekrar isteyin, ve
        //         sartlar saglaninca sifre basariyla kaydedildi" yazdirin

        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali



       boolean sonuc=false;
       while (sonuc==false){
           Scanner scanner=new Scanner(System.in);
           System.out.println("Lutfen sifre");
           String sifre=scanner.nextLine();
           sonuc=sifreKontrolEt(sifre);

       }
        System.out.println("Sifre basarili =========");






    }
    public static boolean sifreKontrolEt(String sifre){
        int sayac=0;
        //         - ilk harf kucuk harf olmali
       if (!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')){
           System.out.println("  ilk harf kucuk harf olmali  ");
           sayac++;
       }
       //                 - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali   ");
            sayac++;
        }
       //                - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("- sifre bosluk icermemeli");
            sayac++;
        }
        //   - uzunlugu en az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("- uzunlugu en az 10 karakter olmali");
            sayac++;
        }
        if (sayac==0) {
            return true;
        }else {
            return false;
        }




    }
}
