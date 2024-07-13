package Arrays;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,0,5,3,2,8};
        int ans = funSecondLargest(arr);
        System.out.println(ans);
    }

    static int funSecondLargest(int[]arr){
        int secLargest = -1;
        Arrays.sort(arr);

        int largest = arr[arr.length-1];
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]!=largest){
                secLargest = arr[i];
                break;
            }
        }

        return secLargest;
    }

}
