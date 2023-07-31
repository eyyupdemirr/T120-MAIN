package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C03_binarySearch {
    public static void main(String[] args) {

        int[]    arr ={0,1,3,2,0,13,4,6,3,6,12,6,23,9};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,12));
        System.out.println(Arrays.binarySearch(arr,6));



    }
}
