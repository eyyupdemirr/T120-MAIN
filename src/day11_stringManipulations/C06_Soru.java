package day11_stringManipulations;

import java.util.Scanner;

public class C06_Soru {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen mail giriniz");
        String str=scanner.nextLine();

        if (!str.contains("@")){
            System.out.println("Gecerssiz mail");
        }  if (!str.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        }  if (!str.endsWith("@gmail.com")) {
            System.out.println("mailde yazim  hatasi");
                    }else System.out.println("hayirli olsun");


    }
}





























