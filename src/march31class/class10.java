package march31class;

public class class10 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
           for(int i=0;i<5;i++){
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println(i);

           }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread3 = new Thread(new trd2());
                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                for(int i=5;i<10;i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);

                }
            }
        });
        Thread thread4 = new trd();

        thread1.start();
        thread2.start();
        thread4.start();


    }
}
class trd extends Thread{

    public void run() {
        for (int i = 10; i < 15; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

        }
    }
}
class trd2 implements Runnable{
public void run(){
    for(int i=15;i<20;i++){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(i);

    }


}

        }
