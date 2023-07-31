package day21_arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArtirma {
    public static void main(String[] args) {

        // verilen array'in tum elementlerini
        // artis miktari kadar artirin

        int[] arr = {3, 5, 2, 7};
        int artis = 10;

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + artis;   //arr[i]+=artis;

        }
        System.out.print(Arrays.toString(arr));
        System.out.println("");

        int[] sayilar = {3, 5, 8, 9, 10};
        artis = 3;

        System.out.println(Arrays.toString(elementleriArtir(sayilar,artis)));


    }

    public static int[] elementleriArtir(int[] arr, int artis) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += artis;
        }
        return arr;
    }
}
