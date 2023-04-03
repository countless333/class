package march31class;

public class class17 {

    public static void main(String[] args) {
Thread thread1 = new Thread(new Runnable() {
    @Override
    public void run() {
   for(int i=0;i<5;i++){
       System.out.println(i);

       try {
           Thread.sleep(500);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

   }
    }
});

Thread thread2 = new Thread(()-> {
   {
        for(int i=5;i<10;i++){
            System.out.println(" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }






        }
   }

    });


Thread thread3 = new Thread( ()->{


    for(int i=100;i<110;i++){
        System.out.println("               "+i);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}  );



thread1.start();
thread2.start();
thread3.start();
Thread thread4 = new trd();
Thread thread5 = new Thread(new trd2());
thread4.start();
thread5.start();

}

class Trd extends Thread{
    @Override
    public void run(){
for(int i = 10;i<15;i++){
    System.out.println("     "+ i);
    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}


    }


}

class Trd2 implements  Runnable {
    @Override
    public void run() {
        for (int i = 15; i < 20; i++) {
            System.out.println("           " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}}
