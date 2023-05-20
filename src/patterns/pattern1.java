package patterns;


public class pattern1 {
    public static void main(String[] args) {
        Pattern1(4);
    }

    static void Pattern1(int n){
        for(int row=1;row<=n;row++){
            //for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}



/*    *
      * *
      * * *
      * * * *     */