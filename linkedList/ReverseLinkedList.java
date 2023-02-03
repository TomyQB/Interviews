package linkedList;
/*
    Input: head = [1,2,3,4,5]
    Output: [5,4,3,2,1]
*/

/*
    Input: head = [1,2]
    Output: [2,1]
*/

/*
    Input: head = []
    Output: []
*/

public class ReverseLinkedList {

    public static void main(String[] args) {

        // ------------------- 1 -------------------
        ListNode node11 = new ListNode(5);
        ListNode node12 = new ListNode(4, node11);
        ListNode node13 = new ListNode(3, node12);
        ListNode node14 = new ListNode(2, node13);
        ListNode node15 = new ListNode(1, node14);
        ListNode res1 = reverseList(node15);
        while (res1 != null) {
            System.out.print(res1.val);
            res1 = res1.next;
        }

        System.out.println();

        // ------------------- 2 -------------------
        ListNode node21 = new ListNode(2);
        ListNode node22 = new ListNode(1, node21);
        ListNode res2 = reverseList(node22);
        while (res2 != null) {
            System.out.print(res2.val);
            res2 = res2.next;
        }

        System.out.println();

        // ------------------- 3 -------------------
        ListNode node3 = new ListNode();
        ListNode res3 = reverseList(node3);
        while (res3 != null) {
            System.out.print(res3.val);
            res3 = res3.next;
        }

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
