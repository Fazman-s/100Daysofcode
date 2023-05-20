package maths;

import java.util.Arrays;
//Reverse of an array
public class Reversal {
    public static void main(String[] args) {
        int[] arr={3,30,69,7,10,90};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(end>start){
            //swapping..
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
