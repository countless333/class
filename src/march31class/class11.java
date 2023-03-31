package march31class;

import java.util.Arrays;

public class class11 {


    public static void main(String[] args) {

//가장 긴 문자열을 출력해라
        String a = "erwgqergeg-erhhj-j-rr-wegawegawegawegawegaweg";
//        String[] b = a.split("-");
//        System.out.println(b);
//        String maxx="";
//        int max = b[0].length();
//        System.out.println(max);
//        for(int i = 0; i < b.length; i++) {
//            if(b[i].length() >= max) {
//                max = b[i].length();
//                maxx = b[i];
//            }
//        }
//        System.out.println("가장 긴 문자열: " + maxx);
//        System.out.println(max);

        ///이게 원래방법

//        String[] k =Arrays.stream(a.split("-")).toArray(String[]::new);
//        String maxlengthstring = Arrays.stream(k).reduce("",(z,x)->z.length()>x.length()?z:x);
//        String maxlengthstring = Arrays.stream(a.split("-")).reduce("",(z,x)->z.length()>x.length()?z:x);
//
//        System.out.println(maxlengthstring);
/////여기까지가 한번에

//        String[] g = Arrays.stream(a.split("-")).toArray(String[]::new);
//        int maxlength = Arrays.stream(a.split("-")).mapToInt(String::length).reduce(0,(u,i)->u>i?u:i);
//int maxlengthindex = Arrays.asList(g).indexOf(Arrays.stream(g).filter(n->n.length()==maxlength).findFirst().get());
//        System.out.println(maxlengthindex);

    }
}
