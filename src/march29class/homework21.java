package march29class;

import com.mysql.cj.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class homework21 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c"));
//        Iterator<String> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            String value = iterator.next();
//            if(value.equals("b")){
//                System.out.println("값 : " + value );
//            }
//        }
//

//        ArrayList<String> ass = new ArrayList<>(Arrays.asList("weg", "e", "h"));
//
//        Iterator<String> iterator = ass.iterator();
//
//        while(iterator.hasNext()){
//            String value = iterator.next();
//
//
//            if(value.equals("e")){
//
//                System.out.println("값은 " + value);
//            }
//
//        }

      ArrayList<String> ass = new ArrayList<>(Arrays.asList("asd", "124", "gg"));

      Iterator<String> iterator = ass.iterator();
      while(iterator.hasNext()){
          String k = iterator.next();

          if(k.contains("a")){
              System.out.println(k);
          }


      }





















    }


}
