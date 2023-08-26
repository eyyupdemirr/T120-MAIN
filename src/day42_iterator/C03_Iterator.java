package day42_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(1);
        sayilar.add(233);
        sayilar.add(-13);

        // index kullanmadan tum elementleri 2 artirin

        ListIterator<Integer> lit = sayilar.listIterator();

        System.out.println(sayilar);
        while (lit.hasNext()) {
            Integer sayi = (Integer) lit.next();

            lit.set(sayi + 2);


        }

        System.out.println(sayilar);

        System.out.println("****************************************************");

        // iterator kullanarak, listenin elementlerini sondan basa dogru yazdirin
        /*
            Iterator veya ListIterator ile calisirken
            Iterator'i en son nerede biraktik sorusu cok onemlidir
            bu soru icin konusursak
            sayilari 2 artirmak icin biz tek tek ilerleyip
            iterator'i listenin sonuna goturduk
         */

        while (lit.hasPrevious()) {

            Integer sayi = (Integer) lit.previous();
            System.out.print(sayi +"  ");

        }

        System.out.println(sayilar);
    }
}
