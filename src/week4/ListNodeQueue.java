package week4;

public class ListNodeQueue {
    ListNode head;

    public ListNodeQueue() {
        this.head = new ListNode();
    }

    public void push(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        while (cur.next != null) cur = cur.next;
        cur.next = node;
    }

    public int pop() {
        int data = this.head.next.data;
        this.head = this.head.next;
        return data;
    }
}