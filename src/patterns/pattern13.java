package patterns;

/*

*****
*   *
*   *
*   *
*****

 */

public class pattern13{
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1 ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
