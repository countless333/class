package march31class;

public class class3 {

    public static void main(String[] args) {

        Thread t = new Thread(){

            @Override
            public void run(){

                for(int i=1;i<5;i++){

                    System.out.println(i);
                    try{   Thread.sleep(500);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }






            }
        };
        t.start();





    }
}
