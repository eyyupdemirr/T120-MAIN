package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class soru120_5 {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.
        // input=input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
        //        System.out.println(input);

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen isim  giriniz");
        String isim=scanner.nextLine();
        System.out.println("Lutfen soyisim giriniz");
        String soyisim=scanner.nextLine();

        if (isim.length()>soyisim.length()){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" ";
            soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
            System.out.println(isim+soyisim);
        }else if (soyisim.length()>=isim.length()){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" ";
            soyisim=soyisim.toUpperCase();
            System.out.println(isim+soyisim);
        }






    }
}
