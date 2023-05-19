import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a= in.nextInt();
        System.out.println("Enter value of b = ");
        int b= in.nextInt();
        System.out.println("The gcd of a,b = "+gcd(a,b));
        System.out.println("The lcm of a,b = "+lcm(a,b));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);

    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);

    }
}
