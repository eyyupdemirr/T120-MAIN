package day15_nestedForLoop_metodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Satir icin rakam giriniz");
        int satir=scanner.nextInt();



        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("*  ");

            }
            System.out.println("");
        }
        System.out.println("===================================");


        for (int i = 1; i <=5 ; i++) {              //satir

            for (int j = 1; j <=7 ; j++) {            //sutun
                System.out.print(i+","+j+"  ");
            }
            System.out.println("");
        }
        System.out.println("=========================================");

        for (int i = 1; i <=satir; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(i+","+j+" ");

            }
            System.out.println("");
        }




    }
}
