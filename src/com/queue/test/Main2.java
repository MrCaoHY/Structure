package com.queue.test;

/**
 * @author Caohaiyang
 * @date 2019/1/14-17:41
 */
public class Main2 {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(5);
        boolean param_1 = obj.enQueue(4);
        boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();
        System.out.println("结果是"+param_1+param_2+param_3+param_4+param_5+param_6);
    }
}
