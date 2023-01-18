package array;

import java.util.HashSet;
import java.util.Set;

/*
    Input: nums1 = [1,2,2,1], nums2 = [2,2]
    Output: [2]
    Example 2:
*/

/*
    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    Output: [9,4]
    Explanation: [4,9] is also accepted.
*/

public class IntersectionOfTowArrays {

    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = { 1, 2, 2, 1 };
        int[] array2A = { 2, 2 };
        for (int i : commonElements(array1A, array2A)) {
            System.out.print(i);
        }

        System.out.println();

        int[] array1B = { 4, 9, 5 };
        int[] array2B = { 9, 4, 9, 8, 4 };
        for (int i : commonElements(array1B, array2B)) {
            System.out.print(i);
        }
    }

    public static int[] commonElements(int[] array1, int[] array2) {

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < array2.length; i++) {
            if (set1.contains(array2[i])) {
                set2.add(array2[i]);
            }
        }

        int[] res = new int[set2.size()];
        int index = 0;
        for (int i : set2) {
            res[index] = i;
            index++;
        }
        return res;
    }
}
