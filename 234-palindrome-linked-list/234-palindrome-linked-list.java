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
    public boolean isPalindrome(ListNode head) {
        
    if(head == null) return true;
        ListNode midd = middleNode(head);
        ListNode last=reverse(midd);
        ListNode curr=head;
        while(last!=null){
            if(curr.val != last.val){
                return false;
            }
            curr=curr.next;
            last=last.next;
        }
        return true;
       
    }
        public ListNode middleNode(ListNode head){
        ListNode fast = head , slow = head;
            while(fast != null && fast.next != null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;    
        }   
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}