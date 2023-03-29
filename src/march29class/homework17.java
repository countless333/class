package march29class;

import java.util.HashMap;
import java.util.Map;

public class homework17 {
    public static void main(String[] args) {

        HashMap<Integer,Integer> ass = new HashMap<>();
        ass.put(142,516);
        ass.put(1,2);
        ass.put(6,9);
        ass.put(12,53);
        System.out.println(homework17.getmax(ass).getClass());




    }
    public static <K extends Number,V extends Number>Map.Entry<K,V> getmax(Map<K,V> map){
        Double max = 0.0;
        for(Map.Entry<K,V> entry:map.entrySet()){
            Double a = entry.getKey().doubleValue()*entry.getValue().doubleValue();
            if(a>max){
                max=a;
                return entry;
            }
        }

        return null;
    }




}
