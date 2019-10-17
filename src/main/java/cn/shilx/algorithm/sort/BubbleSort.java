package cn.shilx.algorithm.sort;

import java.util.Arrays;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int end = arr.length  - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    SortUtils.swap(arr, i, i + 1);
                }
            }
        }
    }
}
