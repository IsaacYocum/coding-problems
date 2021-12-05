package problems.leetcode._1_10;

import objects.ListNode;

public class _2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("Result = ");
        result.print();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(); // store the answer
        ListNode l3 = result; // a dummy pointer to the head of result

        int carry = 0; // store the amount to carry over
        while (l1 != null || l2 != null) { // continue until both linked lists have reached their end
            // Calculate the sum
            int value1 = (l1 != null) ? l1.val : 0; // if l1 is null, return 0
            int value2 = (l2 != null) ? l2.val : 0; // if l2 is null, return 0
            int currentSum = value1 + value2 + carry; // add carry to the sum

            carry = currentSum / 10; // update carry for the next loop
            int lastDigit = currentSum % 10; // the last digit is the remainder of the division by 10
            l3.next = new ListNode(lastDigit); // pre-add the remainder to the next list node

            // Update linked list locations for the next loop
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;
        }

        // Add a new list node if carry is greater than 0
        if (carry > 0) {
            l3.next = new ListNode(carry);
            l3 = l3.next;
        }

        return result.next;
    }
}
