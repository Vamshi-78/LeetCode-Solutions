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
       ListNode p=head;
       int count=0;
       while(p!=null){
        p=p.next;
        count++;
       }
       if(n==count)
       return head.next;
       int c=count-n-1;
       ListNode temp=head;
       while(c-->0){
        temp=temp.next;
       }
      temp.next=temp.next.next;
      return head;
    }
}
