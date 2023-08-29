package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap5= MethodDeposu.ogrenciMapOlustur();
        System.out.println(ogrenciMap5);

       Set<Map.Entry<Integer,String>>entryOgrenciSet =ogrenciMap5.entrySet();
        System.out.println(entryOgrenciSet);

        for (Map.Entry<Integer,String> eachEntrySet:entryOgrenciSet
             ) {

            String eachValue=eachEntrySet.getValue();
            String[] eachArr=eachValue.split("-");

            //System.out.println(Arrays.toString(eachArr));

           eachArr[1]= eachArr[1].toUpperCase();
           // System.out.println(eachArr[1]);

            String yeniValue = eachArr[0] + "-" + eachArr[1] + "-" + eachArr[2] + "-" + eachArr[3] + "-" +eachArr[4];
            eachEntrySet.setValue(yeniValue);

        }

        System.out.println(ogrenciMap5);

    }
}
