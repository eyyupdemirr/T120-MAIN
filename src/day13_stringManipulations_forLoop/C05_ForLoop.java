package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        int input = 40;
        for (int i = input; i <= input + 15; i += 3) {
            System.out.print(i + ", ");
        }
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int baslangicsayisi = scanner.nextInt();

        for (int i = baslangicsayisi; i < 100; i += 10) {
            System.out.print(i + ",");
        }
        System.out.println("");
        for (int i = 100; i >= 1; i--) {
            if (i % 7 == 0)
                System.out.print(i + " ");

        }







        // for (int i =input ; i <input+10 ; i++) {
        //  System.out.print(i+" ");

        //  }
        //  System.out.println("");
        // for (int i =input ; i <=100 ; i+=5) {
        //  System.out.print(i+" ");

        //  }


    }
}
