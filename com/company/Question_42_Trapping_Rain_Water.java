package com.company;

public class Question_42_Trapping_Rain_Water {
    public int trap(int[] height) {
        /*
        Time: O(n)
        Space: O(1)
         */
        int n = height.length;
        int left_Max = 0, right_Max = 0;
        int left = 0, right = n - 1;
        int ans = 0;

        while (left < right) {
            left_Max = Math.max(left_Max, height[left]);
            right_Max = Math.max(right_Max, height[right]);

            if (left_Max <= right_Max) {
                ans += left_Max - height[left];
                left++;
            } else {
                ans += right_Max - height[right];
                right--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
//        Trapping Rain Water
        Question_42_Trapping_Rain_Water obj = new Question_42_Trapping_Rain_Water();
        System.out.println(obj.trap(new int[]{4,2,0,3,2,5}));
    }
}
