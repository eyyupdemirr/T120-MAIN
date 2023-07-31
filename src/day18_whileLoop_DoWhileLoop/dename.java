package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class dename {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
        //        bu halini bize donduren bir method olusturun.

        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scanner=new Scanner(System.in);
        System.out.print("sayi             :");
        int gsayi=scanner.nextInt();
        int sayi=gsayi;
        int birler;
        int rakamlar=0;

        while (sayi>0){
            birler=sayi%10;
            rakamlar=rakamlar+birler;
            sayi/=10;



        }System.out.println(rakamlar);








      //  System.out.println(metniTerseCevir("ali kaya"));
    }
    public static String metniTerseCevir(String metin){

        String tersMetin="";
        int index=metin.length();

        while (index>0){
            tersMetin=tersMetin+metin.charAt(index-1);
            index--;

        }
        return tersMetin;



    }

}
