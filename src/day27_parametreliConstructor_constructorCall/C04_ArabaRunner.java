package day27_parametreliConstructor_constructorCall;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1=new C03_Araba();

        System.out.println(araba1);

        araba1.marka ="Mercedes";
        araba1.model = "E200";
        araba1.yil = 2010;
        araba1.fiyat = 15000;
        araba1.renk = "Siyah";

        System.out.println(araba1);

        C03_Araba araba2=new C03_Araba("BMW","5,20",2017,33000,"mavi");
        System.out.println(araba2);

        C03_Araba araba3=new C03_Araba("volvo","s40",2011,30000,"mavi");
        System.out.println(araba3);




    }
}
