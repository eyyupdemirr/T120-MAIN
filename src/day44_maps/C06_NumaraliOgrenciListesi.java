package day44_maps;

import java.util.Map;

public class C06_NumaraliOgrenciListesi {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap6=MethodDeposu.ogrenciMapOlustur();

        MethodDeposu.numaraliOgrenciListesiYazdir(ogrenciMap6);



    }
}
