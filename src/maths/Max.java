package maths;

public class Max {
    public static void main(String[] args) {
        int[] arr={3,30,69,7,10,90};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }
// max value within a given range
    private static int maxRange(int[] arr, int start, int end) {
        int maxval=arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }

//    max value in the entire array
//    public static int max(int[] arr){
//        int maxval=arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]>maxval){
//                maxval=arr[i];
//            }
//        }
//        return maxval;
//    }
}
