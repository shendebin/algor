package com.shen.algor.threesum;

/**
 * 该算法的内循环为 if (nums[i] + nums[j] + nums[k] == 0) 语句，
 * 总共执行的次数为 N(N-1)(N-2) = N3/6-N2/2+N/3，因此它的近似执行次数为 ~N3/6，增长数量级为 O(N3)。
 * <p>
 * Created by shendebin on 2018/11/28
 */
public class ThreeSumSlow implements ThreeSum {
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
