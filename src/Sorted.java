//Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.

import java.util.Scanner;


public class Sorted {
    static boolean arraySortedOrNot(int[] arr) {
        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                flag = false;
            }
        }
        return flag;
    }

        public static void main (String[] args){
            int[] arr = {10, 20, 55, 40, 50, 60};
                System.out.println(arraySortedOrNot(arr));
            }

        }
//public class Sorted {
//    public static void main(String[] args) {
//        System.out.println("\nCheck if an array is sorted");
//        int[] arr={1,2,3,4,5};
//        System.out.println(sorted(arr));
//    }
//    static boolean sorted(int[] arr){
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]<arr[i-1]){
//                return false;
//            }
//        }
//        return true;
//    }
//}