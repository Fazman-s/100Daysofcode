package patterns;

/*


55555 44444 33333 22222 11111
5555 4444 3333 2222 1111
555 444 333 222 111
55 44 33 22 11
5 4 3 2 1



 */
public class pattern14{
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                for(int k=i;k<n;k++){
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
