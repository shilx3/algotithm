package cn.shilx.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
//        int [] arr = {3,11,5,7,6};
        int [] arr = {331231122,11,321,321,321,321,3,123,11};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}