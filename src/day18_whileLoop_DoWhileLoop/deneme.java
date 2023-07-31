package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip
        //        yazdiran bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen sayi");

        double sayi=scanner.nextDouble();
        System.out.print("lutfen  us");
        int us=scanner.nextInt();

       udHesaplama(sayi,us);




    }

    public static void udHesaplama(double sayi,int us){
        double sonuc=1;

        while (us>0){
           sonuc=sonuc*sayi; //sonuc*=sayi;
           us--;

        }
        System.out.println("sonuc    ;"+sonuc);

    }
}
