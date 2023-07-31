package day17_methodOlusturma_methodOverloading;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        toplama(4,9);
        toplama(4,2.93);
        toplama(5.3,6);
        toplama(4.3,2.4);
        toplama(3.4f,9);
        toplama(2.3f,4f);



    }
    public static void toplama(int sayi1,int sayi2){
        System.out.println("iki int toplami: "+(sayi1+sayi2));
    }
    public static void toplama(int a,double b){
        System.out.println("int ile double toplami: "+(a+b));
    }
    public static void toplama(double b,int a){
        System.out.println("double ve inttoplami: "+(b+a));
    }
    public static void toplama(double sayi1,double sayi2){
        System.out.println("iki double toplami: "+(sayi1+sayi2));
    }

}
