/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Deque;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> holder = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                holder.push(s.charAt(i));
                continue;
            }

            if(holder.isEmpty())
                return false;
            Character c = holder.pop();
            
            if(s.charAt(i) == ')' && c != '(')
                return false;
            if(s.charAt(i) == ']' && c != '[')
                return false;
            if(s.charAt(i) == '}' && c != '{')
                return false;
        }
        return holder.size() == 0;
    }
}
// @lc code=end

