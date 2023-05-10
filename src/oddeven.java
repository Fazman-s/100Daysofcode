public class oddeven {
    public static void main(String[] args) {
        int n=68;
        System.out.println(isodd(n));
    }

    private static boolean isodd(int n) {
        return (n & 1)== 1;
    }
}