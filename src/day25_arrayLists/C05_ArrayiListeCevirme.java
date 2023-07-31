package day25_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {1,3,4,6,7,1,3,8,5,2,3,4,9,0,1,2,5,4,3,2};
        // Bu array'i bir list olarak kaydedin

        List<Integer> forlist=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            forlist.add(arr[i]);
        }
        System.out.println(forlist);
        System.out.println(forlist.remove(0));
        System.out.println(forlist);


    }
}
