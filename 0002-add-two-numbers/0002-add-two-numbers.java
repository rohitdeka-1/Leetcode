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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode temp = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (temp != null && temp2 != null) {
            int val = temp.val;
            int val2 = temp2.val;

            int sum = val + val2 + carry;
            if (sum <= 9) {
                ListNode dum = new ListNode(sum);
                curr.next = dum;
                curr = curr.next;
                carry = 0;
            } else {

                int digit = sum % 10;
                carry = sum / 10;
                ListNode dum = new ListNode(digit);
                curr.next = dum;
                curr = curr.next;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }

        while (temp != null) {
            int sum = temp.val + carry;
            int digit = sum % 10;
            ListNode d = new ListNode(digit);
            curr.next = d;
            curr = curr.next;
            carry = sum / 10;
            temp = temp.next;
        }


        while (temp2 != null) {
            int sum = temp2.val + carry;
            int digit = sum % 10;
            ListNode d = new ListNode(digit);
            curr.next = d;
            carry = sum / 10;
            curr = curr.next;
            temp2 = temp2.next;
        }

        if(carry>0){
            ListNode n1 = new ListNode(carry);
            curr.next = n1;
            curr = curr.next;
        }

        return dummy.next;
    }
}