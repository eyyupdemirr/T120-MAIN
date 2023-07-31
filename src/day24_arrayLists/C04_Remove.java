package day24_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Bulent");
        isimler.add("Tugba");
        isimler.add("Burhan");
        isimler.add("Kaan");

        System.out.println(isimler);
        System.out.println(isimler.remove("hasan"));
        System.out.println(isimler.remove("Kaan"));

        System.out.println(isimler);
        System.out.println(isimler.remove(1));  // silinecek  ismi dondurur.
        System.out.println(isimler);
        System.out.println("===========================================================================" );

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);

        System.out.println(sayilar);
        System.out.println(sayilar.remove(1));
        System.out.println(sayilar);

        Integer silinecekelement=1;
        sayilar.remove(silinecekelement);
        System.out.println(sayilar);


    }
}
