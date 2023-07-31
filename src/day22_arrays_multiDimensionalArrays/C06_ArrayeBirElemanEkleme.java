package day22_arrays_multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {

        // verilen bir array'in uzunlugunu bir artirarak
        // verilen bir element'i ekleyin

        int[] arr = {3, 7, 8, 6};
        int[] arr1={1,3,6,25,8,9};
        int eklenecekSayi = 10;
        int sayi = 123;

        int[] yeniArray = new int[arr.length + 1];
        System.out.println(Arrays.toString(yeniArray));

        for (int i = 0; i < arr.length; i++) {
            yeniArray[i] = arr[i];

        }
        System.out.println(Arrays.toString(yeniArray));
        yeniArray[yeniArray.length - 1] = eklenecekSayi;
        System.out.println(Arrays.toString(yeniArray));

        arr = yeniArray;

        System.out.println("arr nin son hali: " + Arrays.toString(arr));

        System.out.println("==========================");

       arr1= arrayeBirElamanEkle(arr1,1111111);

        System.out.println(" arr son " + Arrays.toString(arr1));


    }

    public static int[] arrayeBirElamanEkle(int[] array, int sayi) {
        int[] yeniarr = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            yeniarr[i] = array[i];
        }

        yeniarr[yeniarr.length - 1] = sayi;
        array = yeniarr;
        return yeniarr;
    }
}
