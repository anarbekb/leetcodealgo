package ru.bamlukanov.leetcodealgo;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            if (nums[middle] < target) {
                begin = middle + 1;
                continue;
            }
            if (nums[middle] > target) {
                end = middle - 1;
                continue;
            }

            return middle;
        }

        return -1;
    }
}
