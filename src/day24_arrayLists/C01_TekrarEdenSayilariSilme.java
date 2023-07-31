package day24_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {
    public static <Lıst> void main(String[] args) {
        // verilen bir int array'de, tekrar eden elementleri silin
        // array'i unique degerlerden olusan haline donusturun

        int[] arr = {2,4,5,3,2,5,1,5,3,7,4,3,6,9,10,12,17};
        // [2,4,5,3,1,7]

        /*
            Array'in en buyuk problemi uzunlugunun degisememesidir.
            Bunun icin java, array altyapisini kullanan
            ama uzunlugu esnek olan ArrayList class'ini olusturmustur.
         */
        List<Integer> tekrarsızList= new ArrayList<>();
        System.out.println(tekrarsızList);

        for (int i = 0; i < arr.length ; i++) {

            if (!(tekrarsızList.contains(arr[i]))){
                tekrarsızList.add(arr[i]);

            }

        }
        System.out.println(tekrarsızList);

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAykuuuuuuuuuuuuuuuuuttttt");

        arr=new int[tekrarsızList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsızList.get(i);

        }
        System.out.println(Arrays.toString(arr));

    }
}
