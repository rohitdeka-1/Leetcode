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

    public int size(ListNode head){
        ListNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public ListNode swapNodes(ListNode head, int k) {
        int size = size(head);
        int fromLast = size - k;

        ListNode temp = head;
        ListNode temp1 = head;

        for(int i=1;i<k;i++){
            temp = temp.next;
        }

        for(int i=0;i<fromLast;i++){
            temp1 = temp1.next;
        }
        
        int val = temp.val;
        temp.val = temp1.val;
        temp1.val = val;

        return head;

    }
}