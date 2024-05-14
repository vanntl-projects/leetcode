/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        return x == reverse(x);
    }

    public int reverse(int x){
        int ret =0;
        while(x != 0){
            ret *=10;
            ret +=x%10;
            x /= 10;
        }
        return ret;
    }
}
// @lc code=end

