package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

public class CountClumps {
    /*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.
countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 4, 4};
        int[] nums2 = {1, 1, 2, 1, 1};
        int[] nums3 = {1, 1, 1, 1, 1};

        System.out.println("Number array1: " + countClumps(nums1));
        System.out.println("Number array2: " + countClumps(nums2));
        System.out.println("Number array3: " + countClumps(nums3));
    }

    public static int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean inClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    inClump = true;
                    clumpCount++;
                }
            } else {
                inClump = false;
            }
        }

        return clumpCount;
    }
}
