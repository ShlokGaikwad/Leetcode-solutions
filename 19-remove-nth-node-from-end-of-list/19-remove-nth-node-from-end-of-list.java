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
        int size = getSize(head);
        if(size==n){
            return deleteFirst(head);
            // return head;
        }
        ListNode cur = get(size-n+1, head);
        cur.next=cur.next.next;
        return head;
        // head=head.next;
        // return deleteFirst(head);
        // return head;
    }
    
    public ListNode deleteFirst(ListNode head){
        head=head.next;
        return head;
    }
    public int getSize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode get(int val,ListNode head){
        ListNode temp = head;
        for(int i=1; i<val-1; i++){
            temp=temp.next;
        }
        return temp;
    }
}