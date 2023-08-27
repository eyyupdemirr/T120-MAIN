package day44_maps;

import java.util.Map;

public class C05_keyIleValueyaUlasma {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap5=MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap5);

        System.out.println(ogrenciMap5.get(110));
        System.out.println(ogrenciMap5.get(109));
        System.out.println(ogrenciMap5.get(1107));//null doner

        MethodDeposu.numaraIleOgrenciBilgisiYazdirma(ogrenciMap5,102);







    }
}
