package march31class;

public class class4 {


    public static void main(String[] args) {

        Thread thread1 = Thread.currentThread();
        System.out.println(thread1.getName());


for(int i=0;i<3;i++){
    Thread thread2 = new Thread(){

        @Override
        public void run(){
            System.out.println("첫번쨰 쓰레드"+getName()+"  동작중");
        }
    };

    thread2.start();
}
Thread thread3 = new Thread(){
    @Override
    public void run(){
        System.out.println("두번째 쓰레드"+getName() + "동작중");


    }

};
thread3.setName("no3-Thread");
thread3.start();



    }
}
