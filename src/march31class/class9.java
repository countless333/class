package march31class;

public class class9 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 5; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }


                }
            }
        });
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {

        }
        thread2.start();
        Thread thread3 = new Thread(new multi2());
        thread3.start();
Thread thread4 = new multi1();
thread4.start();

    }


}

class multi1 extends Thread {
    @Override
    public void run() {
        for (int i = 11; i < 20; i++) {
            System.out.println("이것은 multi1에서 온 쓰레드 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}

class multi2 implements Runnable {
    @Override
    public void run() {
        for (int i = 20; i < 25; i++) {
            System.out.println("이것은 multi2 에서 온 쓰레드  " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
