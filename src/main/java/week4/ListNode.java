package week4;

public class ListNode {
    int data;
    ListNode next;

    public ListNode() {}

    public ListNode(int data) {
        this.data = data;
    }

    static ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        ListNode target = head;
        for (int i = 0; i < position - 1; i++) {
            target = target.next;
        }
        nodeToAdd.next = target.next;
        target.next = nodeToAdd;
        return nodeToAdd;
    }

    static ListNode remove(ListNode head, int positionToRemove) {
        ListNode target = head.next, before = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            before = target;
            target = target.next;
        }
        before.next = target.next;
        return target;
    }

    static boolean contains(ListNode head, ListNode nodeTocheck) {
        while (head != null) {
            if (head.equals(nodeTocheck)) return true;
            head = head.next;
        }
        return false;
    }
}
