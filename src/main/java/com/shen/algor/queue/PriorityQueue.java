package com.shen.algor.queue;

/**
 * Created by shendebin on 2017/11/17.
 */
public class PriorityQueue {

    private int maxSize;
    private int[] queArray;
    private int nItems;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queArray = new int[maxSize];
        this.nItems = 0;
    }
}
