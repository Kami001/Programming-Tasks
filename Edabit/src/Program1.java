
    // Create a method that takes an array of integers and
    // returns an array where each integer is the sum of itself + all previous numbers in the array.

    public class Program1 {
        public static int[] cumulativeSum(int[] nums) {
            int[] cumulativeSums = new int[nums.length];

            if (nums.length == 0) return nums;

            cumulativeSums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                cumulativeSums[i] += (cumulativeSums[i - 1] + nums[i]);
            }
            return cumulativeSums;
        }
    }