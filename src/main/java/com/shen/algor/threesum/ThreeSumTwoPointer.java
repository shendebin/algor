package com.shen.algor.threesum;

import java.util.Arrays;

/**
 * 更有效的方法是先将数组排序，然后使用双指针进行查找，时间复杂度为 O(N2)。
 * <p>
 * Created by shen on 2018/11/28.
 */
public class ThreeSumTwoPointer implements ThreeSum {

    @Override
    public int count(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, h = n - 1, target = -arr[i];
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            while (l < h) {
                int sum = arr[l] + arr[h];
                if (sum == target) {
                    cnt++;
                    while (l < h && arr[l] == arr[l + 1]) l++;
                    while (l < h && arr[h] == arr[h - 1]) h--;
                    l++;
                    h--;
                } else if (sum < target) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        return cnt;
    }
}
