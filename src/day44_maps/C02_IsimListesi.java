package day44_maps;

import java.util.Map;

public class C02_IsimListesi {
    public static void main(String[] args) {


        // ogrenci map'inde bulunan ogrencilerin
        // isim ve soyisimlerini sira numarali bir liste olarak yazdirin

        /*
            map'ler kompleks bilgiler barindirabilir
            barindirdigi bilgi ne kadar kompleks olursa
            o bilginin detaylarina ulasmak da o kadar asama gerektirebilir

            Bu tur kompleks islemleri, her seferinde yeniden kodlamak yerine
            ilk istendiginde method olarak olusturup
            sonra ihtiyac durumunda, o method'u kullanmak daha mantikli olur

            Bir map ile islem yapmak istedigimizde
            ilk bakacagimiz sey istenen bilginin key mi yoksa value'da mi bulundugudur

            Eger sadece value'de olan bir bilgiyi ariyorsak

            1- tum value'leri bir Collection olarak kaydedelim
            2- bir for-each loop ile herbir value'yu ele alalim
            3- value'lar belirli bir ayirac ile birlestirilen String'lerden olustugu icin
               bu ayirac kullanilarak split() ile bir array'e donusturulebilir
            4- artik bir array ve icerisinde value'yu olusturan bilgiler mevcut
               istenen bilgiyi, array'den index ile alabiliriz
         */


        Map<Integer, String> ogrenciMap2 = MethodDeposu.ogrenciMapOlustur();

        ogrenciMap2.put(111, "Yusuf-Can-11-H-MF"); // extradan bir kisi daha ekledik ama analisteyeeklenmiyor sadece buraya
        System.out.println(ogrenciMap2);

        MethodDeposu.isimSoyisimListesiyazdir(ogrenciMap2);


    }
}
