package march29class;

public class homework11 {
    public static void main(String[] args) {
        Double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0};


        calculator cal = new calculator(arr);

        System.out.println(cal.add());





    }

}

class calculator<T extends Number> {
T[] t;
    public calculator(T[] t){
        this.t = t;
    }

    public double add(){
        double sum=0.0;
        for(T z : t){
            sum+=(double)z;

        }
        return sum;
    }






}
