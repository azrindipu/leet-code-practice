package practice.linkedList;

public class Main {

    public static void main(String[] args){
        ListNode head = null;
        LinkedList linkedList = new LinkedList();
        head = linkedList.insertLast(1, head);
        head = linkedList.insertLast(2, head);
        head = linkedList.insertLast(3, head);
        linkedList.printList(head);
        head = linkedList.reverseList(head);
        linkedList.printList(head);
    }
}

class LinkedList {
    public ListNode insertLast(int val, ListNode head){
        if(head == null) return new ListNode(val);
        ListNode tempHead = head;
        while (tempHead.next != null){
            tempHead=tempHead.next;
        }
        tempHead.next= new ListNode(val);
        return head;
    }

    public void printList(ListNode head){
        ListNode node = head;
        System.out.println("Linked List:");
        while (node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slowPointer = null;
        ListNode fastPointer = head;
        while (fastPointer != null){
            ListNode temp = fastPointer.next;
            fastPointer.next= slowPointer;
            slowPointer = fastPointer;
            fastPointer=temp;
        }
        return slowPointer;
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}
