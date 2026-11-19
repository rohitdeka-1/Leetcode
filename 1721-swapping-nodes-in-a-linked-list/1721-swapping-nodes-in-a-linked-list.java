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
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    
    public ListNode swapNodes(ListNode head, int k) {
        int len = size(head);
        int last = len - k;

        ListNode first = head;
        ListNode second = head;

        for(int i=1;i<k;i++){
            first = first.next;
        };


        for(int i=0;i<last;i++){
            second = second.next;
        };

        int val = first.val;
        first.val = second.val;
        second.val = val;

        return head;

    }
}