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


    private ListNode add(ListNode l1,ListNode l2,int carry){
        if(l1==null&&l2==null)
        {
            if(carry>0) return new ListNode(carry);
        return null;
        }


        int val1=(l1==null)?0:l1.val;
        int val2=(l2==null)?0:l2.val;

        int sum = val1+val2+carry;
        carry = sum/10;
        ListNode node = new ListNode(sum%10);

        node.next=add((l1==null)?null:l1.next,(l2==null)?null:l2.next,carry);

        return node;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
        
    }
}
