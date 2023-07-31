package day05_matematikselislemler_increment;

import java.util.Scanner;

public class C02_RakamlartoplaminiBulma {
    public static void main(String[] args) {

        Scanner  scanner= new Scanner(System.in);

        System.out.println("Lutfen uc basamakli bir pozitif tam sayi girin");

        int girilenSayi=scanner.nextInt();

        int birlerbasamagi=0;
        int rakamlarToplami=0;

        birlerbasamagi=girilenSayi%10;   // 7
        rakamlarToplami=rakamlarToplami+birlerbasamagi;  // 7
        girilenSayi=girilenSayi/10;   //25


        birlerbasamagi=girilenSayi%10;  //5
        rakamlarToplami=rakamlarToplami+birlerbasamagi;// 7+5

        birlerbasamagi=girilenSayi/10;  //2
        rakamlarToplami=rakamlarToplami+birlerbasamagi;    //7+5+2



        System.out.println(rakamlarToplami);

        /*// Kullanicidan 3 basamakli bir sayi alip
        // sayinin rakamlarini toplayip, yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        // ilk sayi icin birler basamagini bulalim
        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        // birler basamagindaki sayiyi aldik, artik ondan kurtulalim
        girilenSayi = girilenSayi / 10 ;

        // Bu satira geldigimizde girilen sayiyi 2 basamakli hale donusturduk
        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;
        // buraya geldigimizde artik sayimiz tek basamakli

        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;
        System.out.println("Rakamlar toplami : " + rakamlarToplami);*/















       /* Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen 3 basamakli pozitif tam sayigririniz");

        int girilensayi=scanner.nextInt();

        int birlerBasmagi=0;
        int rakamlarToplami=0;

        birlerBasmagi= girilensayi%10;

        rakamlarToplami=rakamlarToplami+birlerBasmagi;

        girilensayi=girilensayi/10;

        birlerBasmagi= girilensayi%10;

        rakamlarToplami=rakamlarToplami+birlerBasmagi;

        girilensayi=girilensayi/10;
        birlerBasmagi= girilensayi%10;

        rakamlarToplami=rakamlarToplami+birlerBasmagi;

        girilensayi=girilensayi/10;


        System.out.println(rakamlarToplami);*/









    }
}
