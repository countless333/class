package march30class;

import java.util.Arrays;

public class homework29 {


    public static void main(String[] args) {
        String input = "hello-world-java";



String[] kkk = Arrays.stream(input.split("-")).toArray(String[]::new);
int maxindexLength = Arrays.stream(kkk).mapToInt(String::length).reduce(0,(a,b)->a>b?a:b);
int maxindex = Arrays.asList(kkk).indexOf(Arrays.stream(kkk).filter(a->a.length()==maxindexLength).findFirst().get());









//        String[] splitInput = Arrays.stream(input.split("-")).toArray(String[]::new);
//        int maxIndex = Arrays.stream(splitInput).mapToInt(String::length).reduce(0, (a, b) -> a > b ? a : b);
//        int maxLengthIndex = Arrays.asList(splitInput).indexOf(Arrays.stream(splitInput).filter(str -> str.length() == maxIndex).findFirst().get());
//        String maxLengthString = splitInput[maxLengthIndex];



//        String inputt = "hello-java";
//String[] kkk = Arrays.stream(inputt.split("-")).toArray(String[]::new);
//int maxindex = Arrays.stream(kkk).mapToInt(String::length).reduce(0,(a,b)->a>b?a:b);
//int maxlengthindex = Arrays.asList(splitInput).indexOf(Arrays.stream(kkk).filter(str->str.length()==maxindex).findFirst().get());
//        String maxlengthstring = kkk[maxlengthindex];



        String inputt = "java-python";
        String[] kkkk = Arrays.stream(inputt.split("-")).toArray(String[]::new);
        int stringmax = Arrays.stream(kkkk).mapToInt(String::length).reduce(0,(a,b)->a>b?a:b);
        int indexmax = Arrays.asList(kkkk).indexOf(Arrays.stream(kkkk).filter(a->a.length()==stringmax).findFirst().get());




String a = "weyyyyyg-wyrh-qrhggggggggggggggg";
String[] k = a.split("-");

int max = 0;
int index =0;
String g = "";
for(int i=0;i<k.length;i++){
    if (k[i].length()>max){

        max = k[i].length();
        index = i;
        g = k[i];

    }

}

        System.out.println(index + " " + g);


    }
}
