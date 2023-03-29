package march29class;

public class homwork15 {
    public static void main(String[] args) {



    }

    public static <T extends Number> T getMin(T[] t){
        T min =t[0];


        for(int i=1;i<t.length;i++){
            if(t[i].doubleValue()<min.doubleValue()){
                min=t[i];
            }

        }
        return min;

    }



}
