package day04_dataCasting_WrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {
        String str = "Java Candir";

        //int sayi1= str;
       // char chr1= str;
        //boolean bl1= str;
        String str2=str;
        System.out.println(str);

       // boolean bl2='s';

        int sayi2='k';
        double dbl=  sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;

        by1=(byte) dbl2;
        by1=(byte) sh1;

        sayi3 = (int)dbl2;
        sayi3 = sh1;
        sayi3 = by1;

        dbl2 = sayi3;
        dbl2 = sh1;
        dbl2 = by1;






      /*  String str= "Java Candir";

       // boolean bl1=str;

        String s1= str;*/







        //System.out.println(s1);







    }
}
