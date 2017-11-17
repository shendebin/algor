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

    public void insert(int item){
        int j;

        if (nItems == 0){
            queArray[nItems ++] = item;
        }else {
            for (j = nItems-1; j >= 0; j--){
                if(item > queArray[j]){
                    queArray[j+1] = queArray[j];
                }else {
                    break;
                }
                queArray[j+1] = item;
                nItems ++;
            }
        }
    }

    public int remove(){
        return queArray[--nItems];
    }

    public int peekMin(){
        return queArray[nItems-1];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

}
