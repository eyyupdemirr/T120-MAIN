package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen ilkkenari girirniz");

        double kenar1= scanner.nextDouble();

        System.out.println("lutfen ikinci kenari girirniz");

        double kenar2= scanner.nextDouble();

        System.out.println("Dikdortgeni alani =  "+kenar1*kenar2);











    }
}
