package day11_stringManipulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {

        //String isim="Ramazan Uzunkavaklioglu";
        //System.out.println(isim.length());
        //System.out.println(isim.charAt(isim.length()-2));
        //System.out.println(isim.charAt(isim.length()-5));
        //System.out.println(isim.charAt(isim.length()-5));


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isim giriniz");
        String girilenisim = scan.nextLine();
        int uzunluk = girilenisim.length();


        if (uzunluk % 2 == 0) {
            System.out.println("ortadaki harfler  "+girilenisim.charAt(uzunluk / 2) + girilenisim.charAt((uzunluk / 2) - 1));

        } else
            System.out.println(girilenisim.charAt((uzunluk - 1) / 2));

    }
}
