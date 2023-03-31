package march31class;




//쓰레드
public class class1 {

    public static void main(String[] args) {
for(int i=0;i<5;i++){
    Thread t = new Thread(new multi());
    t.start();


}

    }
}
class multi implements   Runnable{
    public void run(){
        System.out.println(Thread.currentThread().toString());


    }

}



