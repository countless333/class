package march29class;

import java.util.*;

public class homework18 {


    public static void main(String[] args) {


        HashMap<Integer,Integer> maa = new HashMap<>();
        maa.put(1,40);
        maa.put(81,4);

        maa.put(261,44);

        maa.put(71,41);

        maa.put(11,411);

        homework18.printkv(maa);


    }

    public static <K extends Comparable<? super K>,V extends  Comparable<? super V>> void printkv(HashMap<K,V> map){
        ArrayList<K> key = new ArrayList<>(map.keySet());
        ArrayList<V> val = new ArrayList<>(map.values());
        Map<K,V> kkk = new LinkedHashMap<>();

        Collections.sort(key,Comparator.naturalOrder());
        Collections.sort(val,Comparator.reverseOrder());
for(int i=0;i<key.size();i++){
    System.out.println(key.get(i)+" "+ val.get(i));

}

    }

}
