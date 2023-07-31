package day04_dataCasting_WrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {

        char ch1='A';

        int sayi1=ch1;

        //char ascidegeri=(char)karakter;

        System.out.println("ch1 ="+ch1);
        System.out.println("sayi=  "+ sayi1);

        String str1="Java";
        String str2="  ";
        String str3="Candir";

        System.out.println(str1+str2+str3);

        char ch2= 'a';
        char ch3= 'y';
        char ch4= 's';
        char ch5= 'e';


        System.out.println(ch2+ch3+ch4+ch5);


        int karakter=76;
        char asciidegeri=(char) karakter;

        System.out.println("verilen sayinin ascii karsiligi     "+asciidegeri);








    }



}
