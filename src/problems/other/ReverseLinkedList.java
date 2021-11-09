package problems.other;

public class ReverseLinkedList {
    public static void main(String[] args)
    {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        ListNode revList;

        System.out.println("Given Linked list");
        list.printList();

        revList = list.reverse(list);
        System.out.println("\nReversed linked list ");
        revList.printList();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public void printList() {
        ListNode current = this;
        System.out.println(current.val);

        ListNode next;

        while (current.next != null) {
            next = current.next;
            System.out.println(next.val);
            current = next;
        }
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        node = prev;
        return node;
    }
}
