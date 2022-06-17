package maharishi;
// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public static void main(String[] args) {
        int[] arr ={7, 2, 5, 10, 8};
        System.out.println(splitNumbers(arr, 2));
    }
    /**
     * @param {int[] nums, int m} Number of subarrays to make
     * */
    static int splitNumbers(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int index = 0; index < nums.length; index++) {
            start = Math.max(start, nums[index]); //by the end of START=max element in the array
            end += nums[index];
        }
        // Apply binary search
        while (start < end) {
          // try middle as potential ans
            int mid = start + (end - start) / 2;
           //calculate how many pieces you can divide by max number
            int subArraySum = 0;
            int pieces = 1;
            for(int num: nums){
                if(subArraySum + num > mid) {
                    // You cannot add this in sub array, make new array instead.
                    // current sum = num  sum added in new array. and increase pieces by one
                    subArraySum = num;
                    pieces++;
                } else{
                    subArraySum += num;
                }
            }
            if(pieces > m){
                start =  mid +1;
            }else {
                end = mid;
            }
        }
        return end; // start == end
    }
}
