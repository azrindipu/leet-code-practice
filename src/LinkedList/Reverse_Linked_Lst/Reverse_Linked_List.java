package LinkedList.Reverse_Linked_Lst;

import LinkedList.LinkedListHelper;
import LinkedList.ListNode;

public class Reverse_Linked_List {
    public static void main(String[] args){
        LinkedListHelper helper = new LinkedListHelper();
        ListNode head = helper.createBasicList();
        helper.printList(head);
        Solution solution = new Solution();
        head = solution.reverseList(head);
        helper.printList(head);
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
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
