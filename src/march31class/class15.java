package march31class;

import java.util.Arrays;

public class class15 {

    public static void main(String[] args) {





        String a = "twe-qwegwqg-r-hewrhwerhwerhwrehh";
        String g = Arrays.stream(a.split("-")).reduce((b,c)->b.length()>c.length()?b:c).get();
/////제일 긴 문자찾는거
        int maxlength = Arrays.stream(a.split("-")).mapToInt(String::length).reduce(Math::max).getAsInt();
//// 제일 긴 문자의 렝스
        int maxlengthindex = Arrays.asList(a.split("-")).indexOf(Arrays.stream(a.split("-")).reduce((z,x)->z.length()>x.length()?z:x).get());
       ///제잉ㄹ 긴 문자의 인덱스

        System.out.println(maxlengthindex);


    }
}
