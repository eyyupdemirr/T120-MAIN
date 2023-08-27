package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;

public class C03_Update {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap3 = MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap3);
        ogrenciMap3 = MethodDeposu.ogrenciBolumDegistir(ogrenciMap3, "TM", "EA");
        ogrenciMap3 = MethodDeposu.ogrenciBolumDegistir(ogrenciMap3, "mf", "SAY");

        System.out.println(ogrenciMap3);

    }
}
