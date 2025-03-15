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
        public ListNode deleteMiddle(ListNode head) {
            int length = 0;
            ListNode temp = head;
            //we dont know the size yet therefore we need to determine the size
            while(temp != null)
            {
                temp = temp.next;
                length++;

            }
            if(length == 1)
                return null;
            temp = head;
            int midIndex = length/2,index = 0;
            while(index < midIndex -1)
            {
                temp = temp.next;
                index++;
            }
            temp.next = temp.next.next;

            return head;
        }
    }