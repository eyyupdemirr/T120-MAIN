package day03_Scanner;

import java.util.Scanner;

public class C07_Swap {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");

        int ilksayi=scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int ikincisayi= scanner.nextInt();


        int temp= ilksayi;
        ilksayi=ikincisayi;
        ikincisayi=temp;

        System.out.println("ilksayinin yeni degeri = "+ilksayi );
        System.out.println("ikinci sayinin yeni degeri = "+ikincisayi );








    }
}
