package maths;

public class Secondlargest {
    static int print2largest(int arr[], int n) {
        // code here
        int max = -1;
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            } else if (arr[i] < max && secondLargest < arr[i]) secondLargest = arr[i];
        }
        return secondLargest;


    }

    public static void main(String[] args) {
        int[] arr={10,30,50,90,22,55};

        int n=print2largest(arr,arr.length);
        System.out.println("Second largest is"+n);
    }


}



