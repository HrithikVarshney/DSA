package Arrays;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,8,4,0,5,3,2,8,7};
        int ans = fun3SecondLargest(arr);
        System.out.println(ans);
    }

    static int fun3SecondLargest (int[] arr){
        //TC : O(N)
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;

        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }


    static int fun2SecondLargest(int[]arr){
        //TC : O(2N {N+N})
        int largest = -1;
        for(int i = 0 ; i<arr.length ; i++){
            largest = Math.max(arr[i] , largest);
        }
        int secLargest = Integer.MIN_VALUE;
        for(int ele : arr){
            if(ele > secLargest && ele != largest){
                secLargest = ele;
            }
        }
        return secLargest;

    }

    static int fun1SecondLargest(int[]arr){
        //TC : O(NlogN)
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
