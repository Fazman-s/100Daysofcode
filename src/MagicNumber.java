import java.util.Random;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int base=5;
        int ans=0;
        while(n>0){
            int last= n & 1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
