package recursion;

public class Numbers {
    public static void main(String[] args) {
        // write a function to take a number and print it
        // print first 5 nums : 1,2,3,4,5
        print(1);
    }
    static void print(int n){
        if( n == 5 ){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);   // function calling itself
    }
}
