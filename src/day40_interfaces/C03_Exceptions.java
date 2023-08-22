package day40_interfaces;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        // kullanicidan iki tamsayi isteyin
        // sayilari birbirne bolup, sonucu yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        try {
            System.out.println(sayi1/sayi2);   //RISKLI BOLUM
        } catch (ArithmeticException e) {
            System.out.println("sifir girmeyin");

        }

    }
}
