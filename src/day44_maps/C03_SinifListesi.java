package day44_maps;

import java.util.Map;

public class C03_SinifListesi {
    public static void main(String[] args) {

        // ogrenci map'de sinif ve sube verdigimizde
        // o sinifta bulunan ogrenci isim ve soyisimlerini yazdirin

        Map<Integer,String> ogrenciMap3=MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap3);


        MethodDeposu.sinifSubedekiOgrenciListesiYazdir(ogrenciMap3,11,"m");


    }
}


