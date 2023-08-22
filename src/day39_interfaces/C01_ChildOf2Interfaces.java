package day39_interfaces;

public class C01_ChildOf2Interfaces extends I02_Interfaces implements I01_Interfaces { @Override
public void method1() {

}

    @Override
    public int method2() {
        return 0;
    }



    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    public static void main(String[] args) {

        System.out.println(sayi2);// 20
        System.out.println(I01_Interfaces.sayi4); // 40
    }
}
