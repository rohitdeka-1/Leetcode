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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       // Result
       ListNode res = new ListNode(0);
       ListNode curr = res;
       ListNode t1 = list1;
       ListNode t2 = list2;

       while(t1!=null && t2!=null ){
        ListNode temp = new ListNode();
        if(t1.val<=t2.val){
            temp.val = t1.val;
            t1 = t1.next;
        }else{
            temp.val = t2.val;
            t2 = t2.next;
        }

        curr.next = temp;
        curr = curr.next;
       }

    if(t1==null){
        curr.next = t2;
    }

    if(t2 == null){
        curr.next = t1;
    }
    
    return res.next;

} }