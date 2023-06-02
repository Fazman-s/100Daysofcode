package patterns;

public class pattern5 {
    public static void main(String[] args) {

        Pattern2(5);
    }
    static void Pattern2(int n){
        for(int row=0;row<=2*n;row++){     //n=5; 2n=10
            int totalColsInRows = row>n ? 2 * n - row: row;
            for (int col = 0; col <= totalColsInRows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

/*

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *


 */