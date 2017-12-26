package com.from.codetool.tool;

/**
 * @author fromfield
 * @create 2017-12-26 10:45
 **/

public class Struct {

    /**用于记录顺序表的长度*/
    int length;

    public final static int[] r = {9, 1, 5, 8, 3, 7, 4, 6, 2, 10, 11, 12, 13, 14};
//public final static int[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


    /**用于交换数组中下标i和j的值*/
    public static void swqp(int[] objs, int i, int j){
        int temp = objs[i];
        objs[i] = objs[j];
        objs[j] = temp;
    }

}
