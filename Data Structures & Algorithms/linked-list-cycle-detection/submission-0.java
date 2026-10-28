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
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head; 

        while (fast != null && fast.next != null){
            
            ListNode nextFast = fast.next.next;
            fast = nextFast; 

            ListNode nextSlow = slow.next; 
            slow = nextSlow; 

            if (fast == slow){
                return true; 
            }

        }

        return false; 

    }
}
