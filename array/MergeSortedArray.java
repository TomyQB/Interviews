package array;
/*
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/

/*
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].
*/

/*
    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
    Explanation: The arrays we are merging are [] and [1].
    The result of the merge is [1].
    Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
*/

class MergeSortedArray {

    public static void main(String[] arrgs) {
        int[] arr11 = { 1, 2, 3, 0, 0, 0 };
        int m1 = 3;
        int[] arr12 = { 2, 5, 6 };
        int n1 = 3;
        for (int i : merge(arr11, m1, arr12, n1)) {
            System.out.print(i);
        }

        System.out.println();

        int[] arr21 = { 1 };
        int m2 = 1;
        int[] arr22 = {};
        int n2 = 0;
        for (int i : merge(arr21, m2, arr22, n2)) {
            System.out.print(i);
        }

        System.out.println();

        int[] arr31 = { 0 };
        int m3 = 0;
        int[] arr32 = { 1 };
        int n3 = 1;
        for (int i : merge(arr31, m3, arr32, n3)) {
            System.out.print(i);
        }

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m - 1;
        int k = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (j < 0 && k >= 0) {
                nums1[i] = nums2[k];
                k--;
            } else if (j >= 0 && k >= 0) {
                if (nums1[j] > nums2[k]) {
                    nums1[i] = nums1[j];
                    nums1[j] = 0;
                    j--;
                } else {
                    nums1[i] = nums2[k];
                    k--;
                }
            }
        }
        return nums1;
    }
}