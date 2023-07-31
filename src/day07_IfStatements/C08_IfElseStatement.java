package day07_IfStatements;

import java.util.Scanner;

public class C08_IfElseStatement {
    public static void main(String[] args) {

        Scanner ali=new Scanner(System.in);
        System.out.println(" Lutfen uc kenari giriniz");

        double kenar1=ali.nextDouble();
        double kenar2=ali.nextDouble();
        double kenar3=ali.nextDouble();

        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            System.out.println("eskenar");
        }else {
            System.out.println("eskenar degil");}







    }
}
