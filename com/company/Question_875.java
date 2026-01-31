package com.company;

public class Question_875 {
    public int minEatingSpeed(int[] piles, int h) {
/*
        Time: O(n log maxPile)
        Space: O(1)
 */
        int low = 1;
        int high = 0;

        // find maximum pile
        for (int p : piles) {
            high = Math.max(high, p);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hours = 0;
            for (int p : piles) {
                hours += (p + mid - 1) / mid; // ceil(p / mid)
            }

            if (hours <= h) {
                ans = mid;        // possible answer
                high = mid - 1;   // try smaller speed
            } else {
                low = mid + 1;    // need faster speed
            }
        }

        return ans;
    }
    public static void main(String[] args) {
//        Koko Eating Bananas
        Question_875 q = new Question_875();
        int[] piles = new int[]{3,6,7,11};
        int h = 8;
        System.out.println(q.minEatingSpeed(piles, h));
    }
}
