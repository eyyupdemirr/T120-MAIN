package day08_IfElseIfStatement;

import java.util.Scanner;

public class C06Emeklilik {
    public static void main(String[] args) {

        //Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir”
        // yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi giriniz E:Erkek,K:Kadin");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas =scanner.nextDouble();
        if (yas>100||yas<=0)
            System.out.println("hatali yas girisi");

        else if (cinsiyet=='E'&&yas>=65){
            System.out.println("Emekli olabilrsiniz");
        } else if (cinsiyet=='E'&&yas<65) {
            System.out.println("Emekli olamazsiniz "+(65-yas)+" yil daha calismaniz gerekir");
        } else if (cinsiyet=='K'&&yas>=60){
            System.out.println("Emekli olabilrsiniz");
        } else if (cinsiyet=='K'&&yas<60) {
            System.out.println("Emekli olamazsiniz "+(60-yas)+" yil daha calismaniz gerekir");}

}}
