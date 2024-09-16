package org.example.master_Lambda;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {

        // If there is only one node, return null (empty list)
        if (head == null || head.next == null) {
            return null;
        }

        // Step 1: Find the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Calculate the middle index
        int middleIndex = length / 2;

        // Step 3: Traverse the list to find and remove the middle node
        current = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            current = current.next;
        }

        // Remove the middle node
        current.next = current.next.next;

        return head;
    }
}
public class MainMain {
    public static void main(String[] args) {

                // Create a linked list: 1 -> 3 -> 4 -> 7 -> 9-> 10
                ListNode list1 = new ListNode(1);
                list1.next = new ListNode(3);
                list1.next.next = new ListNode(4);
                list1.next.next.next = new ListNode(7);
                list1.next.next.next.next = new ListNode(9);
                list1.next.next.next.next.next = new ListNode(10);

                // Create a linked list: 1 -> 3 -> 5 -> 6 -> 7-> 8
                ListNode list2 = new ListNode(1);
                list2.next = new ListNode(3);
                list2.next.next = new ListNode(5);
                list2.next.next.next = new ListNode(6);
                list2.next.next.next.next = new ListNode(7);
                list2.next.next.next.next.next = new ListNode(8);

                OddEvenIndex o = new OddEvenIndex();
                ListNode result = o.oddEvenList(list1);
                while(result != null){
                    System.out.print(result.val + " ");
                    result = result.next;
                }

//                OddEvenElement o = new OddEvenElement();
//                ListNode result = o.oddEvenList(list1);
//                while(result != null){
//                    System.out.print(result.val + " ");
//                    result = result.next;
//                }



//                MergeResult : 1 -> 1 -> 3 -> 3 -> 4-> 5 -> 6 -> 7 -> 7 -> 8 -> 9-> 10

//                SolutionEx s = new SolutionEx();
//                ListNode mergeResult = s.mergeTwoLists(list1,list2);
//
//                while(mergeResult != null){
//                    System.out.print(mergeResult.val + " ");
//                    mergeResult = mergeResult.next;
//                }


//                Reverse r = new Reverse();
//                ListNode result = r.reverseList(list1);
//                while(result != null){
//                    System.out.print(result.val + " ");
//                    result = result.next;
//                }
                }
            }

class OddEvenIndex {
    public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);

        ListNode oddTail = odd;
        ListNode evenTail = even;

        int index = 1;

        while(head != null){
            if((index%2) == 0){
                evenTail.next = new ListNode(head.val);
                evenTail = evenTail.next;
            } else {
                oddTail.next = new ListNode(head.val);
                oddTail = oddTail.next;
            }
            head = head.next;
            index++;
        }

        evenTail.next = null;
        oddTail.next = even.next;

        return odd.next;
    }
}

class OddEvenElement {
    public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);

        ListNode oddTail = odd;
        ListNode evenTail = even;

        while(head != null){
            if((head.val%2) == 0){
                evenTail.next = new ListNode(head.val);
                evenTail = evenTail.next;
            } else {
                oddTail.next = new ListNode(head.val);
                oddTail = oddTail.next;
            }
            head = head.next;
        }

        evenTail.next = null;
        oddTail.next = even.next;

        return odd.next;

    }
}


class SolutionEx {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode merge = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                merge.next = list1;
                list1 = list1.next;
            }else{
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }

        if(list1 != null){
            merge.next = list1;
        }else if(list2 != null){
            merge.next = list2;
        }
        return dummy.next;

    }
}

class Solution1ms {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null || head == null)
            return null;
        ListNode slow = head;   // 1
        ListNode fast = head.next.next;  // 4
//        1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6
        while (fast != null && fast.next != null) {     // 4 && 7   1 && 2  6 && null
            fast = fast.next.next;      // 1    // 6
            slow = slow.next;           // 3    // 4
        }
        slow.next = slow.next.next;     // 7 = 1
        return head;
    }
}


class Reverse {
    public ListNode reverseList(ListNode head) {
        //linked list: 1 -> 3 -> 4 -> 7 -> 9-> 10

        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode reverse = dummy;

        while(stack.isEmpty() == false){
            reverse.next = new ListNode(stack.pop());
            reverse = reverse.next;
        }
        return dummy.next;
    }
}
