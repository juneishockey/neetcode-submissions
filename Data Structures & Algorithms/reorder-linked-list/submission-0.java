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
    public void reorderList(ListNode head) {
        
        // find the middle - when fast --> null, slow is the middle.
        ListNode fast = head;
        ListNode slow = head; 

        while (fast.next != null && fast.next.next != null){
            ListNode fastNext = fast.next.next;  // 2
            fast = fastNext; 

            ListNode slowNext = slow.next; // 1
            slow = slowNext; 
        }

        // reversing the second half 
        ListNode prev = null; 
        ListNode curr = slow.next; 

        while (curr != null){
            ListNode next = curr.next; 
            curr.next = prev;
            prev = curr;  
            curr = next; 

        }
        slow.next = null; 
        
        // merge together - first starts at head, second starts at prev. 
        ListNode first = head;
        ListNode second = prev; 

        while (second != null){
            ListNode firstNext = first.next; 
            ListNode secondNext = second.next; 

            first.next = second; 
            second.next = firstNext; 

            first = firstNext; 
            second = secondNext;

        }
    
    }
}
