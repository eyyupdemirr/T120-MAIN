package day40_interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {


        // Kullanicidan toplanmak uzere sayilar alin
        // kullanici Q'ya bastiginda islemi bitirin
        // ve girilen sayilarin toplamini yazdirin
        int toplam = 0;
        int girilenSayi = 0;
       Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i <1000000 ; i++) {
                System.out.println("Lutfen sayi giriniz");
                girilenSayi=scanner.nextInt();
                toplam+=girilenSayi;

            }
        } catch (InputMismatchException e) {
            char yanlis=scanner.next().charAt(0);

            if (yanlis=='q'|| yanlis=='Q'){
                System.out.println("toplam:  "+toplam);
            }else System.out.println("hatali giris");



        }








    }
}
