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
        // ListNode slow = head;
        // ListNode fast = head;
        // while(head!=null){
        // }
    public int len(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
        
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = len(head);
        if(size==n){
            return head.next;
        }
        ListNode temp = head;
        for(int i=0;i<(size-n-1);i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;

    }

}