package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {
        //   Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglanincaya kadar tekrar isteyin, ve
        //         sartlar saglaninca sifre basariyla kaydedildi" yazdirin

        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali


        /*
            Bu soruyu day17'de cozduk
            ama java'da daha profesyonel kodlama icin
            iki duzeltme yapacagiz
            1-
            while loop'un onundeki parantezin ici
            true oldugu muddetce loop calisir
            bu soruda sonuc variable'i da boolean deger iceriyor
            ama sorunun mantigi acisinda
            sonuc false oldugu muddetce loop calismali
            2-
            while loop her calistiginda
            Scanner scanner = new Scanner(System.in);
            String sifre = scanner.nextLine();
            calisiyor ve yeni bir obje olusturuyor
            bunun yerine daha guzel olani
            loop'dan once objeyi olusturup
            loop'un icerisinde sadece deger atamasi yapmaktir
         */



        boolean sonuc=false;
        Scanner scanner;
        String sifre;

        while (!sonuc){
            scanner=new Scanner(System.in);
            System.out.println("Lutfen sifre");
            sifre=scanner.nextLine();
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
