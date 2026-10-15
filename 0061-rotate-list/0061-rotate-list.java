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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        if(k==0){
            return head;
        }
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        k= k%length;
        int t = length-k;
        
        for(int i=0; i<t; i++){
            fast = fast.next;
        }
        if(fast == null){
            return head;
        }
        while(slow!=null && slow.next!=fast && fast!=null){
            slow = slow.next;
        }
        slow.next = null;
        ListNode dummy = new ListNode(10);
        ListNode d1 = dummy;
        while(fast!=null){
            ListNode x = new ListNode(fast.val);
            d1.next = x;
            d1 = d1.next;
            fast = fast.next;
        }
         dummy = dummy.next;
         d1.next= head;
        return dummy;
    }
}