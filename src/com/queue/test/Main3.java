package com.queue.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Caohaiyang
 * @date 2019/1/14-17:43
 */
public class Main3 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println("The first element is: " + q.peek());
        q.offer(5);
        q.offer(13);
        q.offer(8);
        q.offer(6);
        q.poll();
        System.out.println("The first element is: " + q.peek());
        System.out.println("The size is: " + q.size());
    }

}
