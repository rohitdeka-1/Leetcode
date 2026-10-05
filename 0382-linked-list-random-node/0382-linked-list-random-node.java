import java.util.Random;

class Solution {
    //resorvoir
    //algorithm
    ListNode head;
    Random random;

    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    public int getRandom() {

        ListNode curr = head;

        int result = curr.val;
        int count = 1;

        while (curr != null) {

            if (random.nextInt(count) == 0) {
                result = curr.val;
            }

            count++;
            curr = curr.next;
        }

        return result;
    }
}