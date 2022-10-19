package ru.bamlukanov.leetcodealgo.searchinsertposition;

/**
 * <a href="https://leetcode.com/problems/search-insert-position">leetcode</a>
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length;

        int middle = 0;
        while (begin <= end) {
            middle = (begin + end) >>> 1;
            if (middle >= nums.length) {
                return middle;
            }
            if (nums[middle] == target) {
                return middle;
            }

            if (target > nums[middle]) {
                begin = middle + 1;
                continue;
            }
            if (target < nums[middle]) {
                end = middle - 1;
            }
        }

        return target > nums[middle] ? middle + 1 : middle;
    }
}
