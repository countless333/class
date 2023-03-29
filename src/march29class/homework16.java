package march29class;

import java.util.HashMap;
import java.util.Map;

public class homework16 {
    public static void main(String[] args) {

        HashMap<Integer,Integer> aaa = new HashMap<>();
        aaa.put(1252525,214632171);
        aaa.put(11,1123);
        aaa.put(126452525,214632171);

        aaa.put(12521525,204632171);

        homework16.printoverten(aaa);

    }

    public static <K,V> Map.Entry<K,V> printoverten(Map<K,V> map) {
        for(Map.Entry<K,V> ent : map.entrySet()) {
            if(ent.getValue().toString().length() >= 6) {
                System.out.println(ent.getKey().toString());
                return ent;
            }
        }
        return null;
    }
}
