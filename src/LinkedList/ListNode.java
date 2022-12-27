package LinkedList;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){
        this.val = Integer.MIN_VALUE;
        this.next = null;
    }
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
