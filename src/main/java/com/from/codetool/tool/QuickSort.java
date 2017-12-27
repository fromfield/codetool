package com.from.codetool.tool;

/**
 * 今日宜：面向西南方写程序，BUG 最少
 *
 * @author fromfield  purusesex@gmail.com
 * @create 2017-12-27 15:37
 **/

public class QuickSort {
    public static void main(String[] args){
        int[] r = Struct.r;
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
        r = quickSort(r);
        System.out.println();
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
    }

    private static int[] quickSort(int[] is){
        qSort(is, 0, is.length - 1);
        return is;
    }

    private static void qSort(int[] is, int low, int high){
        int pivot;
        if(low < high){
            pivot = partition(is, low, high);
            qSort(is, low, pivot - 1);
            qSort(is, pivot + 1, high);
        }
    }

    private static int partition (int[] is, int low, int high){
        int pivotkey;
        pivotkey = is[low];
        while(low < high){
            while (low < high && is[high] >= pivotkey){
                high--;
            }
//            if(low != high){
//                Struct.swqp(is, low, high);
//            }
            is[low] = is[high];
            while(low < high && is[low] <= pivotkey){
                low++;
            }
//            if(low != high){
//                Struct.swqp(is, low, high);
//            }
            is[high] = is[low];
        }
        is[low] = pivotkey;//
        return low;
    }
}
