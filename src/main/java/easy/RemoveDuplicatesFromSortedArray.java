package main.java.easy;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class RemoveDuplicatesFromSortedArray {

    public static void testCases() {
        int[] nums = new int[]{1,1,2};
        int[] expectedNums = new int[]{1,2};
        customAssert(nums, expectedNums);

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        expectedNums = new int[]{0,1,2,3,4};
        customAssert(nums, expectedNums);

        nums = new int[]{1,1,1,1,1,2,2,3,};
        expectedNums = new int[]{1,2,3};
        customAssert(nums, expectedNums);
    }

    public static int removeDuplicates(int[] nums) {
        int lastN = -101;
        int uniqueNumbers = 0;
        for(int i = 0; i < nums.length; i++) {
            if(lastN != nums[i]) {
                lastN = nums[i];
                nums[uniqueNumbers] = lastN;
                uniqueNumbers++;
            }
        }
        return uniqueNumbers;
    }

    static void customAssert(int[] nums, int[] expectedNums) {
        int k = removeDuplicates(nums);
        if(k != expectedNums.length) {
            throw new AssertionError("Length mismatch.");
        }
        for (int i = 0; i < k; i++) {
            if(nums[i] != expectedNums[i]) {
                throw new AssertionError("Element mismatch.");
            }
        }
    }
}
