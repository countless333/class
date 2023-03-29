package march29class;

import java.util.HashMap;
import java.util.Map;

public class homework12 {
    public static void main(String[] args) {

        HashMap<String,String> aaaa = new HashMap<>();
        aaaa.put("김은석", "조장");
        aaaa.put("2김은석", "새끼조장");

        aaaa.put("3김은석", "부조장");

        aaaa.put("4김은석", "ㅂㅅ조장");

        aaaa.put("5김은석", "ㅋㅋㅋ조장");

        group group = new group(aaaa);
        group.getcaptain();
        System.out.println(        group.getcaptain()
);
    }








}

class group {
    Map<String, String> a;

    group(Map<String, String> a) {
        this.a = a;
    }


    public Map<String, String> getA() {
        return a;
    }

    public void setA(Map<String, String> a) {
        this.a = a;
    }

    public Map.Entry<String, String> getcaptain() {
        for (Map.Entry<String, String> ent : a.entrySet()) {
            if (ent.getValue().equals("조장")) {
                return ent;
            }
        }

        return null;

    }
}

