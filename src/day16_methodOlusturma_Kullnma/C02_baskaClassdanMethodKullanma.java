package day16_methodOlusturma_Kullnma;

import java.util.Scanner;

public class C02_baskaClassdanMethodKullanma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
        //        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //        isim bosluk soyisim seklinde bize donduren bir method olusturun
        //        input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim=scanner.next();

        System.out.println("Lutfen soyisim giriniz");
        String soyisim=scanner.next();

        System.out.println(isimDuzenle(isim, soyisim));


    }// method un adi ======  isimDuzenle   ====C02_baskaClassdanMethodKullnma
    public static String isimDuzenle(String isim,String soyisim){
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        String istenenFormattaIsimSoyisim=isim+" "+soyisim;

        return istenenFormattaIsimSoyisim;



    }
}
