package LinkedList.Remove_Nth_Node_From_End_of_List;

import LinkedList.LinkedListHelper;
import LinkedList.ListNode;

public class Remove_Nth_Node_From_End_of_List {
    public static void main(String[] args){
        LinkedListHelper helper = new LinkedListHelper();
        ListNode head = helper.createBasicList();
        helper.printList(head);
        Solution solution = new Solution();
        head = solution.removeNthFromEnd(head, 2);
        helper.printList(head);
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (n > 0){
            fastPointer = fastPointer.next;
            n--;
        }
        if(fastPointer == null) return slowPointer.next;
        while (fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return head;
    }
}
