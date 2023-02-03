package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    Input : [10, 4, 6, 3, 5]
    Output: [10, 6, 5]
    Explanation: The elements that are greater than all elements to their right are 10, 6, and 5.
*/

public class FindGreaterElements {

    public static void main(String[] arrgs) {

        // ------------------- 1 -------------------
        List<Integer> list = List.of(10, 4, 6, 3, 5);
        for (int i : listFindGreaterElements(list)) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> listFindGreaterElements(List<Integer> nums) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (stack.isEmpty() || nums.get(i) >= stack.peek())
                stack.push(nums.get(i));
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        return list;
    }

}
