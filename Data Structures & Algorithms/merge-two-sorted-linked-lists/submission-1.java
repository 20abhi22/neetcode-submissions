/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {

    public ListNode helper(ListNode l1,ListNode l2){
            ListNode newNode = new ListNode(0);
            if (l1 == null) return l2;
            if (l2 == null) return l1;
            if(l1.val<l2.val){
                newNode=l1;
                newNode.next=helper(l1.next,l2);
                // return newNode;
                
            }
            if(l1.val>=l2.val){
                newNode=l2;
                newNode.next=helper(l1,l2.next);
             }
             return newNode;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return helper(list1,list2);
        
    }
}