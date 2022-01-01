package problems.leetcode._11_20;

import objects.ListNode;

public class _21_MergeTwoSortedLists
{
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode sortedList = mergeTwoLists(l1, l2);
        sortedList.print();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        ListNode dummyHead = sortedList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dummyHead.next = list1;
                list1 = list1.next;
            } else {
                dummyHead.next = list2;
                list2 = list2.next;
            }

            dummyHead = dummyHead.next;

            if (list1 != null) {
                dummyHead.next = list1;
            } else {
                dummyHead.next = list2;
            }
        }

        return sortedList.next;
    }
}
