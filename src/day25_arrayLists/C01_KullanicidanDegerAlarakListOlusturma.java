package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakListOlusturma {
    public static void main(String[] args) {

            //Soru 2- Kullanicidan istedigi kadar isim alip,
            //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
            //        bir method olusturun.

        System.out.println(isimOlustur());


    }
        public static List<String> isimOlustur(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Lutfen isim giriniz\nBitirmek icin q`ya basiniz.");
            String girilenisim=scanner.nextLine();
            List<String> isimListesi=new ArrayList<>();

            do {
                if (!girilenisim.equalsIgnoreCase("q"))
                    isimListesi.add(girilenisim);

            }while (!girilenisim.equalsIgnoreCase("q"));{
                return isimListesi;
            }




        }
}
