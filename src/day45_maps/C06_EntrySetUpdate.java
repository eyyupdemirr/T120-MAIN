package day45_maps;

import day44_maps.MethodDeposu;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {
    public static void main(String[] args) {

        // Subesi H olan ogrencilerin subesini T yapin

        Map<Integer, String> ogrenciMap6 = MethodDeposu.ogrenciMapOlustur();

        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap6.entrySet();

        for (Map.Entry<Integer, String> eachset : ogrenciEntrySet //101=Ali-Can-9-H-MF
        ) {
            String eachValue = eachset.getValue();  //Ali-Can-9-H-MF

            String[] eachArr = eachValue.split("-");

            if (eachArr[3].equalsIgnoreCase("h")) {
                eachArr[3] = "T";
            }
            String yeniValue = eachArr[0] + "-" + eachArr[1] + "-" + eachArr[2] + "-" + eachArr[3] + "-" + eachArr[4];
            eachset.setValue(yeniValue);

        }


        System.out.println(ogrenciMap6);
    }
}
