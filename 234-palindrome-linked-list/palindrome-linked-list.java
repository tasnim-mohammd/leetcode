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
        ListNode temp = head;
        int number = 0;
        int count = 1;
        int rev =  0;
        while(temp != null)
        {
            number = 10*number+temp.val;
            rev = count*temp.val+rev;
            count *= 10;

            temp = temp.next;
        }

        return number == rev;
    }
}