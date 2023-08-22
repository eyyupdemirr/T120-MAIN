package day40_interfaces;

import java.util.Scanner;

public class C05_Exceptions {
    public static void main(String[] args) {


        // Kullanicidan toplanmak uzere sayilar alin
        // kullanici Q'ya bastiginda islemi bitirin
        // ve girilen sayilarin toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        int girilrnsayi=0;
        int toplam=0;

        try {
            for (int i = 0; i < 10000000; i++) {


            System.out.println("Lutfen sayi giriniz");
            girilrnsayi= scan.nextInt();
            toplam=toplam+girilrnsayi;}




        } catch (Exception e) {
            char yanlis=scan.next().charAt(0);

            if (yanlis=='q'||yanlis=='Q'){
                System.out.println("toplam sayi   :"+toplam);
            }else
                System.out.println("hatli giris");



        }


    }
}
