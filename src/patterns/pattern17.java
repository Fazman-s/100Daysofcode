package patterns;

public class pattern17 {
    public static void main(String[] args) {

        pattern(5);
    }

    static void pattern(int n) {
        for(int i=0;i<n;i++){
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=0;j<2*i+1;j++){
                System.out.print(i);

            }
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}