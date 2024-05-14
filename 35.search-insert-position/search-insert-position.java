/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left;
        while(left<=right){
            mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return left;
    }
}
// @lc code=end

