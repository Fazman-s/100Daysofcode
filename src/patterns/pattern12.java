package patterns;
/*

1
23
456
78910


 */

public class pattern12{
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }


}
