package com.dd.ss;

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        addTwoNumbers(l1, l2);
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null && l2 != null) { 
            int val  = l1.val + l2.val + carry;
            int res = val % 10;
            carry = val / 10;
            ListNode ln = new ListNode(res);
            current.next = ln;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int val = l1.val + carry;
            int res = val % 10;
            carry = val / 10;
            ListNode ln = new ListNode(res);
            current.next = ln;
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int val = l2.val + carry;
            int res = val % 10;
            carry = val / 10;
            ListNode ln = new ListNode(res);
            current.next = ln;
            current = current.next;
            l2 = l2.next;
        }
        if(carry == 1) {
            current.next = new ListNode(1);
        }

        return dummy.next;
    }



}