package day14_forLoops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {
    //Soru 3- Kullanicidan baslangic ve bitis degeri olarak
        // pozitif sayilar alin, sinirlar dahil olarak
        // aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse,
        // uyari yazdirip islemi sonlandirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangic sayisi giriniz");
        int baslangic=scanner.nextInt();

        System.out.println("Lutfen bitis sayisi girin");
        int bitis=scanner.nextInt();

        if (baslangic>bitis){
            System.out.println("Uyari bitis buyuk olmali");
        }else{
           int toplam=0;

            for (int i = baslangic; i <=bitis ; i++) {
               // toplam=toplam+i;
                toplam+=i;

            }
            System.out.println("toplam   :"+toplam);


            }



    }
}






