package day24_arrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C05_get_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Cemil");
        isimler.add("Omer");
        isimler.add("Mertkan");
        isimler.add("Kaan");
        isimler.add("Bulent");
        isimler.add("Tugba");
        isimler.add("Burhan");
        isimler.add("Kaan");
        isimler.add("Cemil");
        isimler.add("Omer");
        isimler.add("Mertkan");

        System.out.println(isimler);

        isimler.add(2,"Burhan");
        System.out.println(isimler);

        isimler.set(2,"Ayse");
        System.out.println(isimler);

        System.out.println(isimler.get(2));

        System.out.println(isimler.indexOf("Kaan1"));
        System.out.println(isimler.lastIndexOf("Kaan"));

        Collections.sort(isimler);
        System.out.println(isimler);


    }
}
