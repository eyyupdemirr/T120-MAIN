package day15_nestedForLoop_metodOlusturma;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        for (int i =1 ; i <=4 ; i++) {
            System.out.print(i+"  ");   //System.out.print(i*1+"  "); ile ayni


        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*2+"  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*3+"  ");

        }
        System.out.println("==============");

        for (int j = 1; j <=3 ; j++) {


            for (int i = 1; i <=4 ; i++) {
                System.out.print(i*j+"  ");
            }
            System.out.println("");

        }








    }
}
