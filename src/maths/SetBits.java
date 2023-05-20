package maths;

public class SetBits {
    public static void main(String[] args) {
        int n=7;
        System.out.println(Integer.toBinaryString(n));

        System.out.println("The number of set bits are = "+setBits(n));
    }

    private static int setBits(int n) {
        int count=0;
        while(n!=0){
            n=n & (n-1);   //n=8,n-1=7 i.e since n>0 -> count=1,(1000) & (111) = 0; now n=0--> out of loop
            count++;

        }
        return count;   //will return count=1 for the above example.
    }
}
