package com.shen.algor.threesum;

/**
 * Created by shendebin on 2018/11/28
 */
public class ThreeSumSlow implements ThreeSum{
    @Override
    public int count(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
