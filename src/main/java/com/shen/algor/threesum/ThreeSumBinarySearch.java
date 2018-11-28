package com.shen.algor.threesum;

import java.util.Arrays;

/**
 * 通过将数组先排序，对两个元素求和，并用二分查找方法查找是否存在该和的相反数，如果存在，就说明存在三元组的和为 0。
 * 应该注意的是，只有数组不含有相同元素才能使用这种解法，否则二分查找的结果会出错。
 * 该方法可以将 ThreeSum 算法增长数量级降低为 O(N2logN)。
 * <p>
 * Created by shen on 2018/11/28.
 */
public class ThreeSumBinarySearch implements ThreeSum {

    @Override
    public int count(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target = -arr[i] - arr[j];
                int index = BinarySearch.search(arr, target);
                // 应该注意这里的下标必须大于 j，否则会重复统计。
                if (index > j) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
