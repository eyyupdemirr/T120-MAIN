package day21_arrays;

public class C04_ElementSay {
    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,5,2,3,5,6,7,1,8};
        int arananSayi = 5;

        elamanSay(arr,13);


    }
   public static void elamanSay(int[]arr,int arananSayi){
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi){
                sayac++;
               // System.out.println(sayac); aktif edresek sayacida yazdirir
            }

        }
        if (sayac==0){
            System.out.println("Aranan sayi array de yok");
        }else
            System.out.println("Aranan "+arananSayi+" sayisi "+sayac+" kere kullanilmistir");

    }

}
