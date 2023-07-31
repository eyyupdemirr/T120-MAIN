package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class soru120_6 {
    public static void main(String[] args) {


        // Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //        yazdirin.
        //         */
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.println("Lütfen bir metin giriniz");
        //        String metin = scanner.nextLine();
        //        int metinLenght = metin.length();

        //        if (metinLenght%2==0){
        //            metin= metin.substring(0,metinLenght/2)+":)"+ metin.substring(2);
        //            System.out.println(metin);
        //        } else {
        //            metin = metin.substring(0,metinLenght/2)+":("+metin.substring(metinLenght/2+1);
        //            System.out.println(metin);
        //        }

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen isim  giriniz");
        String str=scanner.nextLine();
        int lengt=str.length();

        if (lengt%2==0)
            System.out.println(str.substring(0,lengt/2)+":)"+str.substring(2));
        else
            System.out.println(str.substring(0,lengt/2)+":("+str.substring(lengt/2+1));










    }
}
