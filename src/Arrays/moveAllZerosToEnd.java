package Arrays;

import java.util.*;

public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0,2,3,1,0,0,3,4,0,0};
        ArrayList<Integer> ansArray = fun2movesAllZeros(arr);
        System.out.print(ansArray.toString());
    }

    static ArrayList<Integer> fun2movesAllZeros(int [] arr){
        //find first zero element
        ArrayList<Integer> tempArr = new ArrayList<>();
        for(int ele : arr) tempArr.add(ele);
        int index = -1;
        for(int i = 0 ; i<tempArr.size(); i++){
            if(arr[i] == 0){
                index = i;
                break;
            }
        }
        for(int i = index+1 ; i<tempArr.size() ; i++){
            if(arr[i]!=0){
                Collections.swap(tempArr , i , index);
                index++;
            }
        }
        return tempArr;
    }


    static int[] fun1movesAllZeros(int [] arr){
        ArrayList<Integer> temp = new ArrayList<>();
        int noOfNonZeros = 0;
        for(int ele : arr){
            if(ele != 0 ){
                temp.add(ele);
                noOfNonZeros++;
            }
        }
        for(int i = 0 ; i<noOfNonZeros ; i++){
            arr[i]= temp.get(i);
        }
        for(int i = noOfNonZeros ; i<arr.length ; i++){
            arr[i] = 0;
        }
        return arr;
    }
}
