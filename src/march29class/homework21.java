package march29class;

import com.mysql.cj.util.StringUtils;

import javax.imageio.IIOException;
import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

//
//Stream<String> s = Stream.generate(()->"hello");
//s.forEach(System.out::println);
//무한히 hello 찍는거;

//        String[] array = new String[]{"a", "b", "c"};
//        Stream<String> stream1 = Arrays.stream(array);
//        stream1.forEach(System.out::println);
//        System.out.println(stream1);


//Stream<Integer> stream = Stream.iterate(100,n->n+10).limit(5);
//stream.forEach(System.out::println);
//
//
//
//Stream<Integer>stream3 = IntStream.range(1,10).limit(3).boxed();
//stream3.forEach(System.out::println);

//IntStream stream4 = "hellowworld".chars();
//        stream4.forEach(System.out::println);

//IntStream stream = "helloworld".chars();
//stream.forEach(System.out::println);


//        Stream<String> s = Pattern.compile(",").splitAsStream("1,2,3,4");
//        s.forEach(System.out::println);
//
//Stream<String> ss = Pattern.compile("-").splitAsStream("1-2-3-4-5");
//ss.forEach(System.out::println);

//      Iterator<String> iterator = ass.iterator();
//      while(iterator.hasNext()){
//          String k = iterator.next();
//
//          if(k.contains("a")){
//              System.out.println(k);
//          }
//
//
//      }


//Stream<String> stream1 = Stream.of("123", "ggg","13");
//Stream<String> stream2 = Stream.of("gg2g", "44");
//
//
//Stream<String> stream3 = Stream.concat(stream1, stream2);
//stream3.filter(a->a.contains("2g"))
//        .forEach(System.out::println);


        Stream<Integer> strea0 = IntStream.range(1, 9).boxed();
        strea0.filter(a -> ((a % 2) == 0))
                .forEach(System.out::println);

        int[] aaa = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(
                Arrays.toString(Arrays.stream(aaa)
                        .filter(a -> (a % 2) == 0)
                        .toArray())


        );


        Stream<Integer> st = IntStream.range(1, 20).boxed();
        st.filter(a -> (a % 2) == 0)
                .map(a -> a * 9)
                .forEach(System.out::println);


        List<List<String>> ass = Arrays.asList(Arrays.asList("1", "2", "3"), Arrays.asList("5", "1", "1"));
        List<String> g = ass.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


//int sum = IntStream.range(1,10).sum();
////count, max, min, average
//
//        int evensum = IntStream.range(1,5)
//                .filter(a->(a%2)==0)
//                .sum();
//
//    }

//    Set<Integer> evennumber = IntStream.range(1,100).boxed()
//            .filter(a->(a%2)==0)
//            .collect(Collectors.toSet());

//List<String> fruit = Arrays.asList("banana", "apple");
//String f = fruit.stream()
//        .collect(Collectors.joining(",","<",">"));
//
//        System.out.println(f);



List<String> kk = Arrays.asList("apple", "banana", "cuninian");
List<Integer> gg = kk.stream()
        .filter(a->a.length()>5)
        .map(String::length)
        .collect(Collectors.toList());


        System.out.println(gg);

    }
}