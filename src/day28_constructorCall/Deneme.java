package day28_constructorCall;

public class Deneme {
    static int sayi=20;
    int yas=40;
    public Deneme(){
        sayi++;
        yas=10;

    }

    public static int method1(){
        return 2*sayi;
    }

    public static void main(String[] args) {
        Deneme obj1=new Deneme();
        System.out.println(obj1.sayi);
        Deneme obj2=new Deneme();
        int sonuc=obj2.method1();
        System.out.println(obj2.sayi+" , "+obj2.yas+", "+sonuc);
        System.out.println(obj1.sayi);
    }
}
