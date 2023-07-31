package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {


        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen sayi" );
        int girilensayi=scanner.nextInt();

        int sayi=girilensayi;
        int birlerbasmagi=0;
        int rakamlartoplami=0;

        while (sayi>0){
            birlerbasmagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasmagi;
            sayi/=10;
        }
        System.out.println("rakamlar toplami:"+rakamlartoplami);








        /* Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak istediginiz sayiyi yaziniz");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        while (sayi>0){
            birlerBasamagi = sayi%10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println("girilen " + girilenSayi + "'nin rakanlar toplami : " + rakamlarToplami);
         */
    }
}
