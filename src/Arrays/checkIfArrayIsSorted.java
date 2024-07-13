package Arrays;

import java.util.*;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1));
        boolean result = funCheckIfSorted(arr);
        System.out.println(result);
    }

    static boolean funCheckIfSorted(ArrayList<Integer> arr){
        for(int i = 1 ; i<arr.size() ; i++) {
            if(arr.get(i-1) < arr.get(i)){
            }
            else{
                return false;
            }
        }
        return true;
    }
}
