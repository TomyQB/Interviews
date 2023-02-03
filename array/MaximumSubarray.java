package array;

/*
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
*/

/*
    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.
*/

/*
    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
*/

/*
    Input: nums = [-2, -1]
    Output: -1
    Explanation: The subarray [-1] has the largest sum -1.
*/

public class MaximumSubarray {

    public static void main(String[] args) {

        // ------------------- 1 -------------------
        int[] array1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(myMaxSubArray(array1));

        // ------------------- 2 -------------------
        int[] array2 = { 1 };
        System.out.println(myMaxSubArray(array2));

        // ------------------- 3 -------------------
        int[] array3 = { 5, 4, -1, 7, 8 };
        System.out.println(myMaxSubArray(array3));

        // ------------------- 4 -------------------
        int[] array4 = { -2, -1 };
        System.out.println(myMaxSubArray(array4));

    }

    public static int myMaxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int tail = 0;
        int head = 0;

        while (head < nums.length && tail < nums.length) {
            sum += nums[tail];

            if (sum < nums[tail]) {
                sum = 0;
                head++;
                tail = head;
            } else {
                if (sum > max) {
                    max = sum;
                }
                tail++;
            }
        }
        return max;
    }

    public static int bestMaxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
