package patterns;
/*


    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *


 */
public class pattern11{
    public static void main(String[] args) {
        patternf(5);
        patterns(5);
    }
    static void patternf(int n) {
        for(int i=0;i<n;i++){
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void patterns(int n) {
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