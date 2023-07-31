package day17_methodOlusturma_methodOverloading;

public class C05_MethodOverloading {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        toplama('s');
        toplama(4,7,9);









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
    public static void toplama(int a,int b,int c){
        System.out.println(" uc inttoplami: "+(a+b+c));
    }
    public static void toplama(double a,double b,double c){
        System.out.println("uc double toplami: "+(a+b+c));
    }
    public static void toplama(int sayi){
        System.out.println("tek sayi girilince iki ile carpar: "+2*sayi);
        }





}
