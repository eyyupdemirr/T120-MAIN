package day08_IfElseIfStatement;

import java.util.Scanner;

public class C02_IfElse1Statements {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Lutfen tam sayi giriniz");
        int sayi = scaner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Super sayi");
        } else if (sayi % 3 == 0) {
            System.out.println("Sayi 3 e tam bolunuyor");
        } else if (sayi % 5 == 0) {
            System.out.println("Sayi 5 e tam bolunuyor");
        } else {
            System.out.println("Sayi yaramaz sayi");
        }


    }
}
