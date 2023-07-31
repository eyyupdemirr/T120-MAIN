package day16_methodOlusturma_Kullnma;

public class C01_methodOlusturma {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan input olarak verilen bir String,
        //        baslangic ve bitis indexlerine gore
        //        baslangic index'i dahil, bitis index'i haric olacak sekilde
        //        aradaki harfleri yazdiran bir method olusturun.
        //
        //          - kullanici baslangic degeri olarak,
        //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
        //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
        //          hata mesaji yazdirin.

        altString("java guzeldir",3,7);
        System.out.println("");
        altString("beni gordun",11,19);

        String str="aramiz bozulmasin";
        altString(str,4,9 );





    }
    public static void altString(String metin, int basIndex,int bitIndex){
        if (basIndex>bitIndex){
            System.out.println("baslangic bitisten buyuk olamaz");
        } else if (basIndex>metin.length() ||bitIndex>metin.length()) {
            System.out.println("Verilen index sinirlarin disinda");
        }
        else {
            for (int i =basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));

            }
        }

    }





}
