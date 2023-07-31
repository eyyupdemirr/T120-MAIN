package day08_IfElseIfStatement;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("LUtfen urunadedini giriniz");
        int ua= scanner.nextInt();

        System.out.println("mk varmi ? var=V, YOK=y");
        char mk=scanner.next().toUpperCase().charAt(0);


        if(ua>10){
            if (mk=='V'){ System.out.println("yuzde 20");}
            else if (mk=='Y'){
                System.out.println("yuzde  15");
            }else {
                System.out.println("hatli mk girisi");
            }


        }


        else if (ua<=10) {
            if(mk=='V'){
                System.out.println("yuzde 15 3. durum");

        }else if (mk=='Y'){
                System.out.println("yuzde 10");
            }


    }
}}
