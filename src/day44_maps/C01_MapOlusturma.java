package day44_maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_MapOlusturma {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=new TreeMap<>();

      //  ogrenciMap.put(109,"Sevim-Can-11-K-MF"); treeset sirali oldugu icin  keye gore siralar
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"fatma-Cane-10-H-MF");
        ogrenciMap.put(108,"Sevda-Cemil-11-M-TM");
        ogrenciMap.put(109,"Sevim-Can-11-K-MF");

        System.out.println(ogrenciMap);

         /*
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-TM,
        103=Ali-Cem-11-K-TM,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF}
         */
        System.out.println(ogrenciMap.keySet()); //[101, 102, 103, 104, 105, 106, 107, 108, 109] key leri yazdirir

        System.out.println(ogrenciMap.values()); //  valuleri yazdirir.

        System.out.println(ogrenciMap.containsValue("Veli-Cem-10-K-TM"));// boyle value var mi? true





    }
}
