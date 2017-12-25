package com.from.codetool.tool;

/**
 * @author fromfield
 **/

public class Sort {
    /**用于要排序数组个数最大值，可根据需求修改*/
    private static final int MAX_SIZE = 10;
    class Struct{
        /**用于存储要排序数组，r[0]用着哨兵或则临时变量*/
        int[] r = new int[MAX_SIZE + 1];
        /**用于记录顺序表的长度*/
        int length;
    }

    public static void main(String[] args){
        int[] r = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
        r = bubbleSort2(r);
        System.out.println();
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
    }

    /**冒泡排序初级版*/
    private static int[] bubbleSortO(int[] is){
        for(int i = 0; i < is.length; i++){
            for(int j = i + 1; j < is.length; j++){
                if(is[j] < is[i]){
                    swqp(is, i, j);
                }
            }
        }
        return is;
    }

    /**冒泡排序*/
    private static int[] bubbleSort1(int[] is){
        for(int i = 0; i < is.length; i++){
            for(int j = is.length-1; j > i; j--){
                if(is[j-1] > is[j]){
                    swqp(is, j-1, j);
                }
            }
        }
        return is;
    }

    /**冒泡排序优化(可以避免因已经有序的情况下的无意义循环判断。{2,1,3,4,5,6,7,8,9})*/
    private static int[] bubbleSort2(int[] is){
        boolean flag = true;
        for(int i = 0; i < is.length; i++){
            flag = false;
            for(int j = is.length - 1; j > i; j--){
                if(is[j] < is[i]){
                    swqp(is, i, j);
                    flag = true;
                }
            }
        }
        return is;
    }

    /**用于交换数组中下标i和j的值*/
    private static void swqp(int[] objs, int i, int j){
        int temp = objs[i];
        objs[i] = objs[j];
        objs[j] = temp;
    }
}
