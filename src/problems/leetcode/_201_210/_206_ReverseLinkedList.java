package problems.leetcode._201_210;

import objects.ListNode;

public class _206_ReverseLinkedList {
    public static void main(String[] args) {
        ListNode test = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        test.print();

        test = reverseList(test);
        test.print();
    }

    // O(n), must iterate though all nodes in linked list
    // O(1), no new lists are allocated
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next; // position next to the next node
            curr.next = prev; // this is where the swap happens
            prev = curr;      // increment prev by one node (currents position)
            curr = next;      // increment curr to the next position
        }

        head = prev;
        return head;
    }
}


