package march31class;

public class class2 {
    public static void main(String[] args) {


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {


                    System.out.println( "  " + i);


                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        });
//        Thread t1 = new Thread();
        thread.start();


        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
//t1.start();
Thread thread2 = new Thread(new Runnable() {
    @Override
    public void run() {
        for (int i = 6; i <= 10; i++) {


            System.out.println(i);
            try {
                //현재 실행되는 스레드 중지 0.5
                ///멈추면 다음 스레드 동작
                //대기중인 서브스레드랑 동일하다

                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
});
thread2.start();


    }


}
