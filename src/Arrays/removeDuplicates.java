package Arrays;

import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(6,5,57,6,1,2,3,4,5,5,4,3,2,1,5,3,2,1,3));
        //ArrayList<Integer> tempArr =
        fun1RemoveDuplicates(arr);
       // System.out.println(tempArr.toString());
    }

    static void fun1RemoveDuplicates (ArrayList<Integer> arr){
        Set<Integer> ss = new HashSet<>();
        for(int i = 0 ; i<arr.size() ; i++){
            ss.add(arr.get(i));
        }

        for(Integer ele : ss){
            System.out.print(ele+ " " );
        }
    }
}
