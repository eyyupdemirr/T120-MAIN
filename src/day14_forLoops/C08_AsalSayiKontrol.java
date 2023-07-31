package day14_forLoops;

import day16_methodOlusturma_Kullnma.C01_methodOlusturma;

import java.util.Scanner;

public class C08_AsalSayiKontrol {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen sayi");
        int sayi=scanner.nextInt();

        boolean flag=true;
        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0) {
                System.out.println("sayi asal degil");
                flag = false;
                break;

            }
        }
        if (flag)
            System.out.println("ASAl");




    }
}
