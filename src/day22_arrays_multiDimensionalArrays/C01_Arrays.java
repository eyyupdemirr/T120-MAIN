package day22_arrays_multiDimensionalArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Ayse", "Yusuf", "Bugra", "Abdullah", "Nergiz", "Gulay", "Ramazan", "Ali"};
        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirildigini yazdirin

        int kelimeUzunlugu = 0;
        int sayac = 0;

        for (int i = 0; i < isimler.length; i++) {
            kelimeUzunlugu = isimler[i].length();

            if (kelimeUzunlugu % 2 == 1) {
                System.out.println(isimler[i] + " ");
                sayac++;

            }


        }
        System.out.print("toplam" + sayac + " isim yazdirildi");


    }
}
