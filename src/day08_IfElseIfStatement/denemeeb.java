package day08_IfElseIfStatement;

import java.util.Scanner;

public class denemeeb {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mk var  mi Var=V yok=Y");
        char mk=scanner.next().toUpperCase().charAt(0);

        System.out.println("Urun adedi giriniz");
        int  ua= scanner.nextInt();

        if (mk=='V'){
            if (ua>10){
                System.out.println(" yuzde   20");
            } else if (ua<=10) {
                System.out.println("yuzde 15");

            }

        } else if (mk=='Y') {
            if (ua>10){
                System.out.println("yuzde15   3 .durum");
            } else if (ua<=10) {
                System.out.println("yuzde   10");

            }

        }else System.out.println(" hatali  mk girisi");


    }
}
