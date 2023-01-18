package array;

import java.util.HashMap;
import java.util.Map;

/*
    Input: nums = [1,2,3,1]
    Output: true
*/

/*
    Input: nums = [1,2,3,4]
    Output: false
*/

/*
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
*/

class ContainsDuplicate {

    public static void main(String[] arrgs) {

        int[] arr1 = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(arr1));

        int[] arr2 = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(arr2));

        int[] arr3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(containsDuplicate(arr3));

    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return true;
            map.put(nums[i], 1);

        }
        return false;
    }
}