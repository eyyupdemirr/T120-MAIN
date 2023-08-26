package day43_collections;

import java.util.*;

public class C03_ArraydenTekrarEdenleriSilme {
    public static void main(String[] args) {

        int[] arr = {2,4,5,7,3,4,2,1,5,9,4,3,2,3,0,1,3,4,2,5};

        // verilen array'deki tekrar eden elementleri silip
        // array'i her elementin sadece 1 kere bulundugu bir hale donusturun
        // bos bir list olusturup, array'deki elementleri tek tek ele aldik
        // ele aldigimiz element list'de yoksa list'e ekledik

        List<Integer> tekrarsizList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }

        }
        System.out.println(tekrarsizList);

        // Ayni islemi Set ile daha kolay yapabiliriz

        Set<Integer> tekSet= new TreeSet<>();

        for (int i = 0; i < arr.length; i++){
            tekSet.add(arr[i]);
        }

        System.out.println(tekSet);


        System.out.println(Arrays.toString(arr));

        // tekrarsiz elementleri Set olarak elde ettik
        // array'i set'deki elementlerden olusan hale donusturelim

        arr=new int[tekSet.size()];

        int index=0;

        for (Integer each:tekSet
             ) {
            arr[index]=each;
            index++;
        }

        System.out.println("arr nin son hali  "+Arrays.toString(arr));
    }
}
