package linkedList;

/*
    Input: head = [4,5,1,9], node = 5
    Output: [4,1,9]
    Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
*/

/*
    Input: head = [4,5,1,9], node = 1
    Output: [4,5,9]
    Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
*/

public class DeleteNodeInALinkedList {

    public static void main(String[] args) {

        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(1, node11);
        ListNode node13 = new ListNode(5, node12);
        ListNode node14 = new ListNode(4, node13);
        deleteNode(node13);
        while (node14 != null) {
            System.out.print(node14.val);
            node14 = node14.next;
        }

        System.out.println();

        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(1, node21);
        ListNode node23 = new ListNode(5, node22);
        ListNode node24 = new ListNode(4, node23);
        deleteNode(node22);
        while (node24 != null) {
            System.out.print(node24.val);
            node24 = node24.next;
        }

    }

    public static void deleteNode(ListNode node) {
        ListNode pi = node.next;
        node.val = pi.val;
        node.next = pi.next;
    }

}
