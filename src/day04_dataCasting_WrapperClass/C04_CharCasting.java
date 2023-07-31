package day04_dataCasting_WrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("lutfen bir karakter giriniz");

        char girilenkarakter= scanner.next().charAt(0);

        System.out.println("giirlrn karakter    ="+girilenkarakter);

        System.out.println("giirlrn  karakteren sonraki 3karakter    ="+(char)(girilenkarakter+1)+"  "+(char)(girilenkarakter+2)+"   "+(char)(girilenkarakter+3));









       /* Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");

        char girilenkarakter=scanner.next().charAt(0);

        System.out.println("girilrn karakter= "+girilenkarakter);

        System.out.println("girirlrn karakterden sonraki uc karakter"
             +" "           +(char)(girilenkarakter+1)+
        "  "+(char)(girilenkarakter+2));*/



    }
}
