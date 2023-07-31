package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class denme01 {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere pozitif sayilar isteyin
        // kullanici islemi bitirmek icin 0'a basmalidir
        // kullanici 0'a bastiginda kac pozitif sayi girdigini
        // ve toplamlarinin kac oldugunu yazdirin

        /*

        Scanner scanner;
        int sayac=0;
        int toplam=0;
        int girilensayi= 010;   //0 disinda deger verince calisiyor.

        while (girilensayi  != 0){
            scanner=new Scanner(System.in);
            System.out.println("Lutfen sayi giriniz");
            girilensayi=scanner.nextInt();
            if (girilensayi!=0){
                toplam=toplam+girilensayi;
                sayac++;
            }
        }
        System.out.println("girilen "+sayac+" sayinin toplami: "+toplam);

         */

        Scanner scanner;
        int sayac=0;
        int toplam=0;
        int girilensayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen sayi giriniz");
            girilensayi = scanner.nextInt();
            if (girilensayi != 0) {
                toplam = toplam + girilensayi;
                sayac++;
            }
        }
            while (girilensayi != 0) ;
            System.out.println("girilen " + sayac + " sayinin toplami: " + toplam);
















    }
}
