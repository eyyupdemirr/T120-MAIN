package day17_methodOlusturma_methodOverloading;

public class C06_WhileLoop {
    public static void main(String[] args) {
        int toplam=0;

        for (int i = 1; i <=100 ; i++) {
            toplam=toplam+i;
        }
        System.out.println("Toplam: "+toplam);

        toplam=0;
        int i=1;

        while (i<=100){

            toplam=toplam+i;

            i=i+1;
        }
        System.out.println("while:  "+toplam);

    }}
