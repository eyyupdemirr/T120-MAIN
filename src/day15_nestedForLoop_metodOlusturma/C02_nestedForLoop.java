package day15_nestedForLoop_metodOlusturma;

import java.util.Scanner;

public class C02_nestedForLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Satir icin rakam giriniz");
        int satir=scanner.nextInt();

        System.out.println("Sutun icin rakam giriniz");
        int sutun=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print(i+","+j+" ");

            }
            System.out.println("");

        }




    }
}
