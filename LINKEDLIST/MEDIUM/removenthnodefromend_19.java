package LINKEDLIST.MEDIUM;
/*
* Problem: 19. Remove Nth Node From End of List 
    * Difficulty: Medium
    * Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    *
    * Approach:
    * - Use two pointers to find the nth node from the end
    * - Move the first pointer n steps ahead, then move both pointers until the first pointer reaches the end
    * - Remove the target node by adjusting the next pointer of the previous node
    *
    * Time Complexity: O(L) where L is the length of the linked list
    * Space Complexity: O(1) for using constant extra space
    */



public class removenthnodefromend_19 {
    
 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node before head (handles edge cases easily)
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first n+1 steps ahead so that gap = n
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return dummy.next; 
    }
}

}
