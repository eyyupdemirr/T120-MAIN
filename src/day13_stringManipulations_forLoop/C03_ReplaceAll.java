package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen metni giriniz");
        String metin=scanner.nextLine();

        metin=metin.replaceAll("\\d","");
        System.out.println(metin);

        metin=metin.replaceAll("\\s","1");
        System.out.println(metin);

        metin=metin.replaceAll("\\W","");
        System.out.println(metin);

        metin=metin.replaceAll("1"," ");
        System.out.println(metin);

        metin=metin+".";
        System.out.println(metin);




        //    "1Ja4va 8C9a2n5d1i1r._"
       // String metin=scanner.nextLine();
       // metin=metin.replaceAll("\\d","");
//
       // System.out.println(metin);
       // metin=metin.replaceAll("\\W","");
       // System.out.println(metin);
//

    }
}
