package march29class;

import java.util.*;

import static java.lang.Double.NEGATIVE_INFINITY;

public class homework19 {

    public static void main(String[] args) {

//        HashMap<Integer, Integer> aaa = new HashMap<>();
//        aaa.put(1, 4);
//        aaa.put(51, 264);
//        aaa.put(771, 416);
//        aaa.put(61, 4116);
//
//        System.out.println(homework19.summ(aaa));

//        ArrayList<Integer> aaba = new ArrayList<>();
//        aaba.add(1553);
//        aaba.add(15653);
//
//        aaba.add(71553);
//        ArrayList<Integer> aabaa = new ArrayList<>();
//        aabaa.add(1553);
//        aabaa.add(15653);
//
//        aabaa.add(71553);
//        System.out.println(homework19.insect(aaba, aabaa));


        //맵을 받고 V는 넘버를 상속받음. 밸류 맥스값의 키값을 리턴 맵을 인자로 받음.
        //인티저를 수퍼로 받는 리스트에서 가장 큰 값을 꺼내서 리턴. 리스트를 인자로 받음. 인트리턴
        //맵에서 V는 숫자를 상속. 전체합을 리턴
        // T리스트. T는 숫자를 상속. 리스트를 인자로 받음. sum을 리턴

        //두 리시트를 병합하고 공통 요소를 반환
stack<Integer> s = new stack<>();
s.push(4);
s.pop();
//        System.out.println(s.ass);
//        System.out.println(s.isempty());


    }

//공통의 요소를 배열에 넣어 가지고오는
    public static <T> List<T> insect(List<? extends T> a, List<? extends T> b) {
        ArrayList<T> gong = new ArrayList<>();
        for (T t : a) {
            if (b.contains(t)) {
                gong.add(t);

            }


        }


        return (gong);

    }

//두 점사이의 거리
    public static <T extends Number> double distance(T x1, T y1, T x2, T y2) {

        double dx = x2.doubleValue() - x1.doubleValue();
        double dy = y2.doubleValue() - y1.doubleValue();

        return Math.sqrt(dx * dx + dy * dy);

    }
// 배열에서 최고요소를 가지고오는 비교해서.
public static <T extends Comparable <T>> T max(T[] arr){
        T max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].compareTo(max)>0){
                max = arr[i];
            }

        }
        return max;
//// 제네릭 메서드를 사용해서 배열의 최대값 찾기
    //배열에 넣고 빼고 비었냐?
}






}
class stack<T> {
    private List<T> stack = new ArrayList<T>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}