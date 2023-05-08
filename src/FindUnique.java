/*find unique element in array  or
* given a array of numbers in which every num appears twice and only one num appears once. find that num*/


public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,1,5,6,6};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique=0;
        for (int i:arr) {
            unique^=i;
        }
        return unique;
    }

}
