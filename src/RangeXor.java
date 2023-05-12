public class RangeXor {
    public static void main(String[] args) {
// to find xor in range a,b =  xor(b)^xor(a-1)
        int a=3;
        int b=9;
        int ans = xor(b)^xor(a-1); // to find xor in range a,b =  xor(b)^xor(a-1)
        System.out.println("xor from 0 to a = "+xor(a));
        System.out.println("xor from 0 to b = "+xor(b));
        System.out.println("xor a-1 = "+xor(a-1));
        System.out.println("xor from a to b = "+ans);
    }
    //this give xor from 0 to a
    static int xor(int a){
        if (a % 4 ==0){
            return a;
        }
        if (a % 4 ==1){
            return 1;
        }
        if (a % 4 ==2){
            return a+1;
        }
        if (a % 4 ==3){
            return 0;
        }
        return 0;
    }
}
