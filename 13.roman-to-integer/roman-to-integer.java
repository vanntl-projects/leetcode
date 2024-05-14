/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret+=romanToInt(s.charAt(i));
            if(i-1>0 && romanToInt(s.charAt(i)) > romanToInt(s.charAt(i-1))){
                ret -= s.charAt(i-1)*2;
            }
        }
        return ret;
    }
    public int romanToInt(char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
// @lc code=end

