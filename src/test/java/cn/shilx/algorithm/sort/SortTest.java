package cn.shilx.algorithm.sort;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void bubbleSort() {
        long start = System.currentTimeMillis();
        sortTest(BubbleSort.class);
        System.out.println((System.currentTimeMillis() - start));
    }

    @Test
    public void insertSort() {
        long start = System.currentTimeMillis();
        sortTest(InsertSort.class);
        System.out.println((System.currentTimeMillis() - start));
    }

    @Test
    public void mergeSort() {
        long start = System.currentTimeMillis();
        sortTest(MergeSort.class);
        System.out.println((System.currentTimeMillis() - start));
    }

    @Test
    public void selectSort() {
        long start = System.currentTimeMillis();
        sortTest(SelectSort.class);
        System.out.println((System.currentTimeMillis() - start));
    }

    /**
     * 采用读数法对排序方法，进行测试
     *
     * @param clazz 将排序的方法作为参数传入
     */
    private void sortTest(Class clazz) {
        try {
            Method sortMethod = clazz.getMethod("sort", int[].class);
            int testTime = 500000;
            int maxSize = 100;
            int maxValue = 100;
            boolean succeed = true;
            for (int i = 0; i < testTime; i++) {
                int[] arr1 = generateRandomArray(maxSize, maxValue);
                int[] arr2 = copyArray(arr1);
                sortMethod.invoke(clazz.newInstance(), arr1);
                comparator(arr2);
                if (!isEqual(arr1, arr2)) {
                    succeed = false;
                    break;
                }
            }
            System.out.println(succeed ? "Nice!" : "Fucking fucked!");

            int[] arr = generateRandomArray(maxSize, maxValue);
            printArray(arr);
            sortMethod.invoke(clazz.newInstance(), arr);
            printArray(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // for test
    private void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    private int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    private int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    private boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    private void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}