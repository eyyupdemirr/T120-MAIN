package day26_forEachLoop_constructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf = "j";
        int sayac=0;
        String[] cumle1=cumle.split("");
        System.out.println(Arrays.toString(cumle1));


        for (String each:cumle1
             ) {
            if (each.equals(harf)){
                sayac++;

            }


        }
        if (sayac==0)
            System.out.println(harf+" :Hic kullanilmamis");
        else
            System.out.println("aradiginiz `"+harf+"` harfi "+sayac+" kere kullanilmis");

    }
}
