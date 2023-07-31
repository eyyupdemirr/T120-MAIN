package day09_NestedaifElseStatements_Terrary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen birtam sayi giriniz");
        int girilenSayi= scanner.nextInt();

        System.out.println(girilenSayi%2==0? "Cift sayi" :"tek sayi");




    }
}
