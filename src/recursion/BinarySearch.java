package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,55,67,77,100};
        int target =777;
        System.out.println(search(arr,target,0,arr.length-1));

    }

    public static int search(int arr[], int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m= s+(e-s)/2;

        if(arr[m]==target){
            return m;
        }

        if(arr[m] < target){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}
