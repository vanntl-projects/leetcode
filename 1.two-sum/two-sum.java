/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> holder = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            // System.out.println("find target with " + nums[i]);
            if(holder.containsKey(target-nums[i])){
                // System.out.println("found target with " + holder.indexOf(target-nums[i]));
                return new int[]{i, holder.get(target-nums[i])};
            }
            holder.put(nums[i], i);
        }
        return new int[]{};
    }
}
// @lc code=end

