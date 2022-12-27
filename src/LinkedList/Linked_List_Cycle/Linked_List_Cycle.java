package LinkedList.Linked_List_Cycle;

import LinkedList.LinkedListHelper;
import LinkedList.ListNode;

import java.security.DomainLoadStoreParameter;
import java.util.HashSet;
import java.util.Set;

public class Linked_List_Cycle {
    public static void main(String[] args){
        LinkedListHelper helper = new LinkedListHelper();
        ListNode head = helper.createBasicList();
        ListNode tail = helper.getTail(head);
        tail.next=head;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.hasCycle(head));

        Solution solution = new Solution();
        System.out.println(solution.hasCycle(head));
    }

}

class Solution{
    public boolean hasCycle(ListNode head) {
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer == slowPointer) return true;
        }
        return false;
    }
}

class Solution1 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if(!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}