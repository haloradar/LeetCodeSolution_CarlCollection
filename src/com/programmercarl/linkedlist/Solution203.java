package com.programmercarl.linkedlist;

/**给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @author Administrator
 * @version 1.0
 */
public class Solution203 {

      public class ListNode {
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


      public ListNode removeElements(ListNode head, int val) {

          while (head!=null&&head.val==val){
              head=head.next;
          }
          if(head==null){
              return null;
          }

          ListNode p=head;
          while(p.next!=null){
              if(p.next.val==val){
                  p.next=p.next.next;
              }else{
                  p=p.next;
              }

          }
          return head;

      }


      }

