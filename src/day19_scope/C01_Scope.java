package day19_scope;

public class C01_Scope {

    static int classLevelStatic = 12;
    String strClassLevelStaticOlmayan="Java guzeldir";


    public static void main(String[] args) {

        int sayiMain = 28;
        for (int i = 0; i <10 ; i++) {
            int sayiForLoop=5;

        }


    }

    public static void staticMetod() {

        String strStaticMethod = "Java Candir";

    }

    public void staticOlmayanMetod() {

        boolean blStaticOlmayanMethod = true;

    }
}
