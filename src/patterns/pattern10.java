package patterns;
/*
*****
 ***
  *

*/
public class pattern10{
    public static void main(String[] args) {
        pattern(3);
    }

    static void pattern(int n) {
        for(int i=0;i<n;i++){
            //space
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i + 1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}