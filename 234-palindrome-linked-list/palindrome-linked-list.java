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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode next = null;
        ListNode current = slow;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode secondhalf = prev;
        ListNode firsthalf = head;
        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val){
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
}