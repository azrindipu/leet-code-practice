package LinkedList.Merge_k_Sorted_Lists;

import LinkedList.LinkedListHelper;
import LinkedList.ListNode;

public class Merge_k_Sorted_Lists {
    public static void main(String[] args){
        LinkedListHelper helper = new LinkedListHelper();
        ListNode[] array = new ListNode[2];
        array[0] = helper.createBasicList();
        array[1] = helper.createBasicList(true);
        Solution solution = new Solution();
        ListNode mergedHead = solution.mergeKLists(array);
        helper.printList(mergedHead);
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        while (lists.length > 1){
            ListNode[] tempList = null;
            if(lists.length % 2 == 0){
                tempList = new ListNode[lists.length/2];
            }else{
                tempList = new ListNode[lists.length/2+1];
            }
            int index =0;
            for(int i=0; i<lists.length; i+=2){
                ListNode l1 = lists[i];
                ListNode l2 = lists[i+1] != null? lists[i+1]: null;
                ListNode mergedHead = this.mergeList(l1, l2);
                tempList[index++]=mergedHead;
            }
            lists = tempList;
        }
        return lists[0];
    }

    private ListNode mergeList(ListNode l1, ListNode l2){
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;
        while (l1 != null && l2 != null){
            if(l1.val > l2.val){
                tail.next = l2;
                l2 = l2.next;
            }else{
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
        }
        if(l1 != null){
            tail.next = l1;
        }
        if(l2 != null){
            tail.next = l2;
        }
        return dummyNode.next;
    }
}