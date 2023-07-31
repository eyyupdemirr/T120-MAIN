package day15_nestedForLoop_metodOlusturma;

import java.util.Scanner;

public class C06_KendiSubStringimiz {
    public static void main(String[] args) {

        boolean flag=true;
       Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();
        char ilkharf=sifre.charAt(0);
        if (!((ilkharf>='a'&&ilkharf<='z'))){
            System.out.println(" ilk harf kucuk harf olmali");
            flag=false;}
        char sonkarekter=sifre.charAt(sifre.length()-1);
        {
            if (!(sonkarekter >= '0' && sonkarekter <= '9'))
                System.out.println("son karakter rakam olmali");
            flag=false;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag=false;}
        if (!(sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag=false;
        }
        if (flag){
            System.out.println(" sifre basarili");
        }



    }
}
