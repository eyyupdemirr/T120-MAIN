package day42_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(13);
        sayilar.add(123);
        sayilar.add(23);
        sayilar.add(33);
        sayilar.add(9);
        sayilar.add(3);

        // index kullanmadan 10'dan buyuk olan elementleri silin

        Iterator itr=sayilar.iterator();

        while (itr.hasNext()){
            Integer sayi= (Integer) itr.next();

            if (sayi>10){
                itr.remove();
            }
        }

        System.out.println(sayilar);

        System.out.println("*****************************************************************");

        sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(13);
        sayilar.add(123);
        sayilar.add(23);
        sayilar.add(33);
        sayilar.add(9);
        sayilar.add(3);
        // for loop kullanarak 10'dan buyuk sayilari silin
        for (int i = 0; i < sayilar.size() ; i++) {
            if (sayilar.get(i)>10){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar); // [23, 13]

        for (int i = 0; i < sayilar.size() ; i++) {
            if (sayilar.get(i)>10){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar); // [23, 13]
    }
}
