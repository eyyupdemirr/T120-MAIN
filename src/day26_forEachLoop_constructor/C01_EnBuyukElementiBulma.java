package day26_forEachLoop_constructor;

public class C01_EnBuyukElementiBulma {
    public static void main(String[] args) {

        // array'in elementlerinden en buyuk olani bulun

        int[] arr = {3,6,9,1,3,7,12,34,23,87,32,-43,145};
        int enbuyukelemen=arr[0];

        for (int each:arr
             ) {
            if (each>enbuyukelemen)
                enbuyukelemen=each;

        }
        System.out.println("enbuyukelemen:"+enbuyukelemen);

    }
}
