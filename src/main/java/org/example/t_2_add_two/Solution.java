package org.example.t_2_add_two;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 * Вам даны два непустых связанных списка, представляющих два неотрицательных целых числа. 
 * Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру. 
 * Сложите два числа и верните сумму в виде связанного списка.
 *
 * Вы можете предположить, что эти два числа не содержат никакого начального нуля, кроме самого числа 0.
 */
class Solution {
    String link = "https://leetcode.com/problems/add-two-numbers/";

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);

        ListNode curr1 = head1;
        ListNode curr2 = head2;

        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        for (int i = 0; i < arr1.length; i++) {
            curr1.next = new ListNode(arr1[i]);
            curr1 = curr1.next;
        }

        for (int i = 0; i < arr2.length; i++) {
            curr2.next = new ListNode(arr2[i]);
            curr2 = curr2.next;
        }

        ListNode first = head1.next;
        ListNode a = first;
        while (a != null) {
            System.out.print(a.val);
            a = a.next;
            System.out.print(a != null ? ", " : "\n");
        }

        ListNode second = head2.next;
        ListNode b = second;
        while (b != null) {
            System.out.print(b.val);
            b = b.next;
            System.out.print(b != null ? ", " : "");
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
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

