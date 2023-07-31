package day08_IfElseIfStatement;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class C03_IfElse2Statement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lutfen notunuzu girirniz");
        double not = scanner.nextDouble();

        if (not > 100 || not < 0) {
            System.out.println("Lutfen gecerli not giriniz");
        } else if (not >= 85) {
            System.out.println("Notunuz AA");
        } else if (not >= 65) {
            System.out.println("Notunuz BB");
        } else if (not >= 50) {
            System.out.println("Notunuz CC");
        } else System.out.println("Notunuz DD");


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("lutfen notunuzu giriniz");
        // double not = scanner.nextDouble();
        // if (not >= 85) System.out.println("AA");
        // else if (not >= 65) System.out.println("BB");
        // else if (not >= 50) System.out.println("CC");
        // else System.out.println("DD");


    }
}
