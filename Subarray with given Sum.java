
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        int start = 0;
        int sum = 0;

        ArrayList<Integer> result = new ArrayList<>();

        for(int end = 0; end < arr.length; end++){
            sum += arr[end];

            while(sum > target){
                sum -= arr[start];
                start++;
            }
            
             if(sum == target){
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;

    }
}
