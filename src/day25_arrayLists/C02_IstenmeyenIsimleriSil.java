package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenmeyenIsimleriSil {
    public static void main(String[] args) {
        // Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun


        String[] arr = {"Mehmet","Ramazan","Ozan","Berk","Nergiz","Ayfer","Bugra"};

        List<String>isimler=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            isimler.add(arr[i]);
        }
        System.out.println("list isimlerin listesi  : \n"+isimler);

        System.out.println(istenmeyenleriSil(isimler, "t"));

        isimler=istenmeyenleriSil(isimler,"an");
        System.out.println(isimler);

    }

    public static List<String> istenmeyenleriSil(List<String> isimler,String istenmeyenIfade){

        List<String>yenilist=new ArrayList<>();

        for (int i = 0; i <isimler.size(); i++) {

          if ( !isimler.get(i).contains(istenmeyenIfade)){
              yenilist.add(isimler.get(i));

          }

        }
        return yenilist;

    }

}
