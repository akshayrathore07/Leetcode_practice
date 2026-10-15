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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
           
            temp=temp.next;
             length++;
        }
        
        int t = length-n;
        if(t==0){
            return head.next;
        }
        for(int i=0; i<t; i++){
            fast= fast.next;
        }
        while(slow!=null && slow.next!=fast && fast!=slow){
            slow = slow.next;
            
        }
        slow.next = slow.next.next;
        return head;
    }
}