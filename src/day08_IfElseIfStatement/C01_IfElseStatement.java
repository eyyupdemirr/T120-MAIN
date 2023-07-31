package day08_IfElseIfStatement;

import java.util.Scanner;

public class C01_IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        char girilenKarakter=scanner.next().charAt(0);

        if (girilenKarakter>='A'&&girilenKarakter<='Z')
        System.out.println("girilen karekter buyuk harf");
        else
            System.out.println("girilen karekter buyuk harf degil");

        //char a='d';
        //char b ='e';
        //System.out.println(a-b);



















    }
}
