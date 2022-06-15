package maharishi;

import java.util.Arrays;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] answ = firstLastPosition(nums, target);
        System.out.println(Arrays.toString(answ));

    }
    public static int[] firstLastPosition(int[] nums, int target){
        int start = findFirstIndex(nums, target, true);
        int end = findFirstIndex(nums, target, false);
      return new int[] {start, end};

    }
    public static int findFirstIndex(int[] nums, int target, boolean isItFirstIndex) {
        int start =0, end = nums.length -1, ans= -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            }else if(target> nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(isItFirstIndex) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
