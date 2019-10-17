package cn.shilx.algorithm.sort;

import java.util.HashSet;
import java.util.Set;

public class GetNotInclude {

    /**
     * 不考虑空间复杂度的情况下，用hashMap存肯定是最快的
     * @param arr 数组A
     * @param brr 数组B
     */
    public static void getNotInclude1(int[] arr, int[] brr) {
        Set<Integer> arrSet = new HashSet<>(arr.length * 2);
        for (int aNum : arr) {
            arrSet.add(aNum);
        }

        for (int bNum : brr) {
            if (!arrSet.contains(bNum)) {
                System.out.print(bNum + "\t");
            }
        }
    }

    public static void getNotInclude2(int[] arr, int[] brr){
        //TODO:采用二分法计算B是不是存在A中
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};
        int[] brr = {4, 5, 8, 10,3,56,7,54,3,65,8,4,8,4,8,44};

        getNotInclude1(arr, brr);
    }
}
