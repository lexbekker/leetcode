package org.example.t_234_palindrome;

import java.util.ArrayList;

/**
 *
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * Учитывая заголовок односвязного списка, верните значение true,
 * если это палиндром, или false в противном случае.
 */

public class Main {
    String solution = "https://leetcode.com/problems/palindrome-linked-list/discuss/1137027/JS-Python-Java-C%2B%2B-or-Easy-Floyd's-%2B-Reversal-Solution-w-Explanation";
    public static void main(String[] args) {

    }

    public boolean isPalindrome(final ListNode head) {
        if (head == null) return false;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        list.add(temp.val);
        while (temp.next != null) {
            temp = temp.next;
            list.add(temp.val);
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            if (!list.get(i).equals(list.get(size - 1 - i)))
                return false;
        }
        return true;
    }

    public boolean isPalindrome1(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
