package march29class;

import java.util.ArrayList;
import java.util.List;

public class homework12{
    public static void main(String[] args) {

        ArrayList<Integer> a= new ArrayList<>();
        for(int i=0;i<10;i++){

            a.add(i);
        }
homework12.add(a);
        System.out.println(homework12.add(a));
    }
    public static <T> String add(T t1, T t2){

        String g = t1.toString() + t2.toString();
        return g;
    }

    public static Integer add(List<?> list){
        Integer sum=0;
        for(Object o : list){

            sum+=(Integer) o;
        }

return sum;
    }


}
class  genericcla<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}