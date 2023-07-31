package day24_arrayLists;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {

        int[] arr={6,-4,12,0,-10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int x=12;
        int y= Arrays.binarySearch(arr,12);

        System.out.println(y);




    }
}
