package LinkedList.Merge_Two_Sorted_Lists;

import LinkedList.LinkedListHelper;
import LinkedList.ListNode;

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args){
        LinkedListHelper helper = new LinkedListHelper();
        ListNode list1 = helper.createBasicList();
        ListNode list2 = helper.createBasicList(true);
        helper.printList(list1);
        helper.printList(list2);

        Solution solution = new Solution();
        ListNode mergedHead = solution.mergeTwoLists(list1, list2);
        helper.printList(mergedHead);
    }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;
        while (list1 != null && list2 != null){
            if(list1.val > list2.val){
                tail.next = list2;
                list2 = list2.next;
            }else{
                tail.next = list1;
                list1 = list1.next;
            }
            tail = tail.next;
        }
        if(list1 != null) tail.next = list1;
        if(list2 != null) tail.next = list2;
        return dummyNode.next;
    }
}