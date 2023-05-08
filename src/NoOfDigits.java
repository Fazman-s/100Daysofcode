import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number"); //if n=10,b=10 ans=2 or n=10 b=2 ans=4(1010)
        int n=s.nextInt();
        System.out.println("Enter the base of the number");
        int b=s.nextInt();

        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println("no of digits are "+ans);
    }
}
