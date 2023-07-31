package day25_arrayLists;

public class C06_ForEachLoop {
    public static void main(String[] args) {


        int[] arr1 = {20,30,5,45,3,4,6,7,1,3,8,5,2,3,4,9,0,1,2,5,4};
        // array'in tup elementlerini toplayin
        // array'in tum elementlerini yazdirin
        // array'in elementlerinden cift sayi olanlari yazdirin
        // array'in elementlerinden en buyuk olani bulun
        /*
            array'in tum elementlerini gozden gecirmemiz gereken sorularda
            for loop kullaniriz
            for loop'un en onemli ozelligi index sayesinde
            tum elementleri 0.index'den sonuncu index'e kadar sirali olarak getirmesidir
            ama bu sorularda elementi sirasiyla getirmesinin hic bir onemi yok
            indexin yani sirali getirmenin onemli olmadigi durumlarda
            for loop yerine for-each loop kullaniriz
         */

        for (int getirilecek:arr1
        ){
            if (getirilecek%2==0){
            System.out.print(getirilecek+" ");}
        }

    }
}
