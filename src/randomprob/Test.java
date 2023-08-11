package randomprob;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Size of the array
            int s = sc.nextInt(); // Target sum

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = findClosestSum(arr, n, s);
            System.out.println(result);
        }

        sc.close();
    }

    private static int findClosestSum(int[] arr, int n, int s) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minDiff = Integer.MAX_VALUE;

        while (right < n) {
            sum += arr[right];

            while (sum > s) {
                minDiff = Math.min(minDiff, Math.abs(sum - s));
                sum -= arr[left];
                left++;
            }

            minDiff = Math.min(minDiff, Math.abs(sum - s));
            right++;
        }

        return minDiff;
    }
}