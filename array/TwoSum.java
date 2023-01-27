package array;

import java.util.HashMap;
import java.util.Map;

/*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

/*
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
*/

/*
    Input: nums = [3,3], target = 6
    Output: [0,1]
*/

public class TwoSum {

    public static void main(String[] arrgs) {

        int[] arr1 = { 2, 7, 11, 15 };
        int n1 = 9;
        for (int i : twoSum(arr1, n1)) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] arr2 = { 3, 2, 4 };
        int n2 = 6;
        for (int i : twoSum(arr2, n2)) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] arr3 = { 3, 3 };
        int n3 = 6;
        for (int i : twoSum(arr3, n3)) {
            System.out.print(i + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = { 0, 1 };

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }
            map.put(target - nums[i], i);
        }

        return res;
    }
}
