package march30class;

public class homework21 {

    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<6;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=6;k>i;k--)
            System.out.print("*");
            System.out.println();
        }


    }
}
