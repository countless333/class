package march31class;

public class class5 {
    public static void main(String[] args) {

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=12;i<18;i++){
                    System.out.println("Thread3      " + i);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
            }
        });


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<5;i++){
                    System.out.println("Thread1 " + i);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
            }
        });


        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                thread3. start();
                try{                thread3. join();}catch (Exception e){}

                for(int i=5;i<10;i++){
                    System.out.println("Thread2   " + i);
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();

//
        thread2.run();

    }
}
