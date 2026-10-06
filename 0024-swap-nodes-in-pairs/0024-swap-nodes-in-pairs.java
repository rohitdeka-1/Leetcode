class Solution {
    public ListNode swapPairs(ListNode head) {
        //recursion

        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = first.next;

        first.next = swapPairs(first.next.next);
        second.next = first;

        return second;

        //Iterative - intuitive

        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode prev = dummy;

        // while (prev.next != null && prev.next.next != null) {
        //     ListNode first = prev.next;
        //     ListNode second = first.next;

        //     first.next = second.next;
        //     second.next = first;
        //     prev.next = second;

        //     prev = first;

        // }
        
        // return dummy.next;

    }
}