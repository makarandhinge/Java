package org.example.LeetCode;

import java.util.*;

    public class DifferenceArray {
        public static List<List<Integer>> findDistinctElements(int[] nums1, int[] nums2) {
            // Convert arrays to sets to remove duplicates
            Set<Integer> set1 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }

            Set<Integer> set2 = new HashSet<>();
            for (int num : nums2) {
                set2.add(num);
            }

            // Find distinct elements
            Set<Integer> distinct1 = new HashSet<>(set1);
            distinct1.removeAll(set2);

            Set<Integer> distinct2 = new HashSet<>(set2);
            distinct2.removeAll(set1);

            // Convert sets back to lists
            List<Integer> list1 = new ArrayList<>(distinct1);
            List<Integer> list2 = new ArrayList<>(distinct2);

            // Return the result
            List<List<Integer>> result = new ArrayList<>();
            result.add(list1);
            result.add(list2);
            return result;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3};
            int[] nums2 = {2, 4, 6};

            List<List<Integer>> result = findDistinctElements(nums1, nums2);
            System.out.println(result);  // Output: [[1, 3], [4, 6]]
        }
    }


