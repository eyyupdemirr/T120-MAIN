package day14_forLoops;

import java.util.Scanner;

public class C05_rakamlarToplami {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen sayi gir");
        int girilensayi=scanner.nextInt();

        int sayi=girilensayi;
        int birlerbasamagi=0;
        int rakamlartoplami=0;
        int basmaksayisi=(sayi+"").length();

        for (int i = 1; i <=basmaksayisi ; i++) {
            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi; //rakamlartoplami+=birlerbasamagi
            sayi=sayi/10;                                   //   sayi/=10

        }
        System.out.println("rakamlar toplami   "+rakamlartoplami);











    }
}
