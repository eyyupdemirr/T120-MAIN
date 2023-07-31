package day22_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {

        String[] harfler = {"L","a","P","d","T","t"};
        System.out.println(Arrays.toString(harfler));
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));

        String[] isimler = {"ali", "alim"," mehmet", "yusuf", "hakan", "muhammed", "aykut eren", "osman"};

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        int[]sayilar={4,12,3,6,15,12,13,125,16,19,150,2,6,16};
        Arrays.sort(sayilar,3,8);
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
