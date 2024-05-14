/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class Solution {
    public int[] plusOne(int[] digits) {
        long num = 0;
        for (int i = 0; i < digits.length; i++) {
            num *= 10;
            num += digits[i];
        }
        num++;
        return Stream.of(String.valueOf(num).split("")).mapToInt(Integer::valueOf).toArray();
    }
}
// @lc code=end

