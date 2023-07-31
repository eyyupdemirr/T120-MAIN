package day21_arrays;

public class C07_EnUzunEnKisakelimeyazdir {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler = {"ali", " mehmet", "yusuf", "hakan", "muhammed", "aykt eren", "osman"};

        enUzunEnKisaYazdir(isimler);

    }

    public static void enUzunEnKisaYazdir(String[] isimler) {
        String enKisaKelime = isimler[0];
        String enUzunKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzunKelime.length()) {
                enUzunKelime = isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()) {
                enKisaKelime = isimler[i];
            }


        }System.out.println("En uzun isim : " + enUzunKelime + "\n\nEn kisa isim : " + enKisaKelime);


    }
}
