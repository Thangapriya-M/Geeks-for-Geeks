import java.util.*;

class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondlargest=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                secondlargest=arr[i];
                break;
            }
        }
        
        return secondlargest;
        }
}