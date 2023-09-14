package patterns;

/*


1 2 3 4 5
11 22 33 44 55
111 222 333 444 555
1111 2222 3333 4444 5555
11111 22222 33333 44444 55555


 */
public class pattern16{
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=i;k++){
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
