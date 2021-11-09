package problems.leetcode._1_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _2_AddTwoNumbers {
    public static ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    public static ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


    public static void main(String[] args) {
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> buildResult = new ArrayList<>();
        ListNode result = new ListNode();

        ListNode revL1 = reverseListNode(l1);
        ListNode revL2 = reverseListNode(l2);

        System.out.println();

        while (true) {
//            System.out.println(revL1.val);
//            System.out.println(revL2.val);

            buildResult.add(revL1.val + revL2.val);

            if (revL1.next == null && revL2.next == null) {
                break;
            }

            if (revL1.next != null) {
                revL1 = revL1.next;
            }

            if (revL2.next != null) {
                revL2 = revL2.next;
            }
        }

        for (int i = 0; i < buildResult.size() - 1; i++) {
            ListNode next = new ListNode();

            if (i == 0) {
                result.val = buildResult.get(i);
            } else {
                next = new ListNode(buildResult.get(i));

            }
        }

//        while (l1.next != null && l2.next != null) {
//            addTwoNumbers(l1.next, l2.next);
//            System.out.println(l1.val);
//            System.out.println(l2.val);
//
//            result.add(l1.val + l2.val);
//
//            if (l1.next != null) {
//                l1 = l1.next;
//            }
//
//            if (l2.next != null) {
//                l2 = l2.next;
//            }
//        }

//        System.out.println(result);

        return new ListNode(l1.val + l2.val);
    }

    private static ListNode reverseListNode(ListNode listNode) {
        ListNode prev = null;
        ListNode current = listNode;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        listNode = prev;
        return listNode;
    }
}

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
