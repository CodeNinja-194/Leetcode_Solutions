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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        
        while(current != null && current.next != null){
            //save pointers
           ListNode nextPair = current.next.next;
            ListNode second = current.next;
            
            //reverse this pair
            second.next = current;
            current.next = nextPair;
            prev.next = second;
            
            //update pointers
            prev = current;
            current = nextPair;
        }
        
        return dummy.next;
    }
}