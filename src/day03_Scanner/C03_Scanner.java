package day03_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen bir double sayi giriniz");

        double girilenDouble= scanner.nextDouble();


        System.out.println("lutfen bir tam sayi giriniz");

        int girilenInt= scanner.nextInt();


        System.out.println("Girilen syilarin toplami  =" +  (girilenDouble+ girilenInt));

        System.out.println("Girilen syilarin toplami  =" +  girilenDouble* girilenInt);



















    }


}
