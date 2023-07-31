package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //        ikisinde ortak olan elementleri ayri bir liste olarak veren
        //        bir program yazin.



       int[] arr1 = {3,5,8,1,0,3,9,2,4,7,13,6,15,19,27,36,11}; //3358133927
       int[] arr2 = {2,7,3,5,8,1,0,9,0,3,52,12,17,26,11,36};

        List<Integer> ortakElemanListesi=new ArrayList<>();

        for (Integer each:arr1
             ) {
            for (Integer each1:arr2
            ) {
                if (each==each1&&!ortakElemanListesi.contains(each1))
                    ortakElemanListesi.add(each);



            }

        }
        Collections.sort(ortakElemanListesi);
        System.out.print(ortakElemanListesi);







    }
}
