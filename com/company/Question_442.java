package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_442 {
    public List<Integer> findDuplicates(int[] nums) {
        /*
        Time: O(n)
        Space: O(n)
        */
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }
    public static void main(String[] args) {
//        Find All Duplicates in an Array
        Question_442 obj = new Question_442();
        System.out.println(obj.findDuplicates(new int[]{3, 4, 2, 3, 1,2}));
    }
}
