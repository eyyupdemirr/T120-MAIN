package day46_nestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C02_TreeMapMethodlari {
    public static void main(String[] args) {

       // Map<String,Integer> harfler = new TreeMap<>();

        TreeMap<String,Integer> harfler = new TreeMap<>();


        harfler.put("K",25);
        harfler.put("L",10);
        harfler.put("T",5);
        harfler.put("Z",50);
        harfler.put("A",15);
        harfler.put("D",56);
        harfler.put("H",500);
        harfler.put("O",1);

        System.out.println(harfler); // {A=15, D=56, H=500, K=25, L=10, O=1, T=5, Z=50}

        System.out.println(harfler.tailMap("L"));
        System.out.println(harfler.tailMap("C"));

        System.out.println(harfler.tailMap("L", false)); // L haric  yazdir

        System.out.println(harfler.headMap("L"));
        System.out.println(harfler.headMap("L",true));

        System.out.println(harfler.ceilingKey("C"));
        System.out.println(harfler.ceilingKey("U"));

        System.out.println(harfler.higherKey("K"));
        System.out.println(harfler.higherKey("C"));

        System.out.println(harfler.ceilingEntry("K"));
        System.out.println(harfler.higherEntry("K"));

        System.out.println(harfler.floorKey("K"));
        System.out.println(harfler.floorKey("M"));

        System.out.println(harfler.lowerKey("K"));
        System.out.println(harfler.lowerKey("G"));

        System.out.println(harfler.pollFirstEntry()); // A=15
        System.out.println(harfler); // {K=25, L=10, T=5, Z=50}
        System.out.println(harfler.pollLastEntry()); // Z=50
        System.out.println(harfler); // {K=25, L=10, T=5}
        System.out.println(harfler.descendingKeySet()); // [T, L, K]
        System.out.println(harfler.descendingMap()); // {T=5, L=10, K=25}
        // harfler = harfler.descendingMap();



    }
}
