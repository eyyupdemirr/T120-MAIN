package day18_whileLoop_DoWhileLoop;

public class C07_whileLoop {
    public static void main(String[] args) {


         /*
            3 cesit loop gorduk
            hepsinin avantajlari ve dezavantajlari var
            1- for loop baslangic ve sonucu belirli sayi olan durumlarda
               veya kac kere tekrar edecegimizi bildigimiz durumlarda avantajli
            2- while loop; kac kere tekrar edecegini bilmedigimiz
               islemleri yapmak icin avantajli
            3- do-while loop kullanicidan deger alarak yaptigimiz islemlerde
               ilk deger atamasini kod yazan kisinin degil de
               kullanicinin yapmasi acisindan avantajli
         */
        int bas = 22;
        int bit = 20;
        int toplam = 0;
        // while loop ile baslagic degeri ile bitis degeri arasindaki
        // sayilari toplayip yazdirin (sinirlar dahil)

        do {
            toplam+=bas;
            bas++;

        }while (bas<=bit);

        System.out.println("toplam  do while  ile  :"+toplam);

        while (bas<bit){
            toplam+=bas;
            bas++;
        }
        System.out.println(toplam);



    }
}
