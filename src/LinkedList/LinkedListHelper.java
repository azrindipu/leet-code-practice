package LinkedList;

public class LinkedListHelper {
    public ListNode insertLast(int val, ListNode head){
        if(head == null) return new ListNode(val);
        ListNode tempHead = head;
        while (tempHead.next != null){
            tempHead = tempHead.next;
        }
        tempHead.next = new ListNode(val);
        return head;
    }

    public ListNode createBasicList(){
        ListNode head = null;
        head = this.insertLast(1, head);
        head = this.insertLast(2, head);
        head = this.insertLast(3, head);
        head = this.insertLast(4, head);
        head = this.insertLast(5, head);
        return head;
    }

    public void printList(ListNode head){
        ListNode tempHead = head;
        System.out.println("LIST: ");
        while (tempHead != null){
            System.out.print(tempHead.val +" ");
            tempHead = tempHead.next;
        }
        System.out.println();
    }

    public ListNode getTail(ListNode head){
        ListNode tempHead = head;
        while (tempHead.next != null){
            tempHead = tempHead.next;
        }
        return tempHead;
    }
}
