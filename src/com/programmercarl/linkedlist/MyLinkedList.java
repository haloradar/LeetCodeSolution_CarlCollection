package com.programmercarl.linkedlist;

/**
 * @author Administrator
 * @version 1.0
 */
/*
private class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val=val;
    }
}
public class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        size=0;
        head=new ListNode(0);
    }

    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        ListNode p=head.next;
        for(int i=0;i<index){
            p=p.next;
        }
        return p.val;

    }

    public void addAtHead(int val) {
        addAtIndex(0,val);

    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
  //  在链表中的第 index 个节点之前添加值为 val  的节点。

    //  果 index 大于链表长度，则不会插入节点。
    //  如果index小于0，则在头部插入节点。
    //  如果 index 等于链表的长度，则该节点将附加到链表的末尾。

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if(index<0){
            index=0;
        }

        ListNode p=head;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        ListNode addNode=new ListNode(val);
        addNode.next=p.next;
        p.next=addNode;
        size++;

    }

    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
        ListNode p=head;
        for(int i=0;i<index){
            p=p.next;
        }
        p.next=p.next.next;
        size--;
        return;

    }
}
*/