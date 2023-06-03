package patterns;

public class pattern6 {
    public static void main(String[] args) {

        Pattern(5);
    }
    static void Pattern(int n){
        for(int row=0;row<=2*n;row++){//n=5; 2n=10
            int totalColsInRows = row>n ? 2 * n - row: row;
            int noOfSpaces= n-totalColsInRows;
            for(int s=0;s< noOfSpaces;s++){
                System.out.print(" ");
            }

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