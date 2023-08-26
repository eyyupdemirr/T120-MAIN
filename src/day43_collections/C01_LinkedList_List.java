package day43_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_List {
    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        isimler.add("Omer");
        isimler.add("Cemil");
        isimler.add("Nergiz");
        isimler.add("ali");

        List<String> ikinciList = new LinkedList<>();

        ikinciList.add("Mustafa");
        ikinciList.add("Cemil");
        ikinciList.add("ali");
        ikinciList.add("mehmet");
        ikinciList.add("yusuff");

        System.out.println(isimler.retainAll(ikinciList)); // true
        System.out.println("ilk lste son" +isimler); // [Cemil]
                // ortak elemanlar disindaki tum elemanlari siler

        System.out.println("ikinci list "+ ikinciList); // [Mustafa, Cemil]

        ikinciList.retainAll(isimler);

        System.out.println(ikinciList); // [Cemil]



    }
}
