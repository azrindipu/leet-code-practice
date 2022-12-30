package LinkedList.Reorder_List;

import LinkedList.LinkedListHelper;
import LinkedList.ListNode;

public class Reorder_List {
    public static void main(String[] args) {
        LinkedListHelper helper = new LinkedListHelper();
        ListNode head = helper.createBasicList();
        helper.printList(head);

        Solution solution = new Solution();
        head = solution.reorderList(head);
        helper.printList(head);
    }
}

class Solution {
    public ListNode reorderList(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while (fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        ListNode secondListHead = slowPointer.next;
        slowPointer.next = null;
        secondListHead = this.reverseList(secondListHead);
        ListNode firstListHead = head;
        while (secondListHead != null){
            ListNode temp1 = firstListHead.next;
            ListNode temp2 = secondListHead.next;
            firstListHead.next = secondListHead;
            secondListHead.next = temp1;
            firstListHead = temp1;
            secondListHead = temp2;
        }
        return head;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
