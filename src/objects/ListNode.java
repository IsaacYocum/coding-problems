package objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode dummy = this;

        while (dummy.next != null) {
            System.out.print(dummy.val);
            dummy = dummy.next;
        }

        System.out.println(dummy.val);
    }
}
