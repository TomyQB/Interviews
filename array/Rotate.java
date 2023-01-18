package array;

/*
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

/*
    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation: 
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
*/

/*
    Input: nums = [1, 2], k = 3
    Output: [2, 1]
    Explanation: 
    rotate 1 steps to the right: [2, 1]
    rotate 2 steps to the right: [1, 2]
    rotate 3 steps to the right: [2, 1]
*/

public class Rotate {

    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
        int k1 = 3;
        for (int i : rotate(array1, k1)) {
            System.out.print(i);
        }

        System.out.println();

        int[] array2 = { -1, -100, 3, 99 };
        int k2 = 2;
        for (int i : rotate(array2, k2)) {
            System.out.print(i);
        }

        System.out.println();

        int[] array3 = { 1, 2 };
        int k3 = 3;
        for (int i : rotate(array3, k3)) {
            System.out.print(i);
        }
    }

    public static int[] rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] aux = new int[k];
        for (int i = 0; i < k; i++) {
            aux[i] = nums[nums.length - i - 1];
        }

        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = aux[k - 1 - i];
        }
        return nums;
    }
}
