package com.programmercarl.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
//https://leetcode-cn.com/problems/implement-stack-using-queues/
class MyStack {
    private Queue<Integer> topQueue;
    private Queue<Integer> stackQueue;


    public MyStack() {
        topQueue = new LinkedList<>();
        stackQueue = new LinkedList<>();
    }

    public void push(int x) {
        topQueue.offer(x);


    }

    public int pop() {
        outTop();
        int temp = topQueue.poll();
        inTop();
        return temp;

    }

    public int top() {
        outTop();
        int temp = topQueue.peek();
        while (!topQueue.isEmpty()) {
            stackQueue.offer(topQueue.poll());
        }
        inTop();
        return temp;

    }

    public boolean empty() {
        return topQueue.isEmpty();
    }

    private void outTop() {
        while (topQueue.size() != 1 && topQueue.size() != 0) {
            stackQueue.offer(topQueue.poll());
        }
    }
    private void inTop() {
        while (!stackQueue.isEmpty()) {
            topQueue.offer(stackQueue.poll());
        }
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */