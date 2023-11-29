package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

public class CanBalance {
    /*
Given a non-empty array, return true if there is a place to split
the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
     */
    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 2, 1};
        int[] array2 = {2, 1, 1, 2, 1};
        int[] array3 = {10, 10};

        System.out.println("Can balance array1? " + canBalance(array1)); // Should print true
        System.out.println("Can balance array2? " + canBalance(array2)); // Should print false
        System.out.println("Can balance array3? " + canBalance(array3)); // Should print true
    }

    public static boolean canBalance(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }
}