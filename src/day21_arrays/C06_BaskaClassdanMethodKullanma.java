package day21_arrays;

import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {
        int[] arr={2,2,4,60,9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr, 5)));

        arr=C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,10);
        System.out.println("son arr"+Arrays.toString(arr));

        System.out.println("===================================================================");

        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr));


        System.out.println("===================================================================");

        C04_ElementSay.elamanSay(arr,17);

        System.out.println("===================================================================");

        // kullanicidan deger alarak int[] olusturmak istiyorum

        int[] kullaniciArrayi=C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));


    }
}
