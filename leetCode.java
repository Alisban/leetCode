//2. Add Two Numbers https://leetcode.com/problems/add-two-numbers/description/
//回答1
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode p = l1,q=l2;
        int size1 = 0,size2 = 0,sum1 = 0,sum2=0;
        while(p != null){
            sum1 += Math.pow(p.val,size1);
            size1++;
            p = p.next;
        }
        while(q!= null){
            sum2 += Math.pow(q.val,size2);
            size2++;q= q.next;
        }
        int sum = sum1+sum2;
        while(sum != 0){
            ListNode sumNode = new ListNode(sum%10);
            sumNode.next = headNode;
            headNode = sumNode;
            sum = sum/10;
        }
        return headNode;
    }
}
