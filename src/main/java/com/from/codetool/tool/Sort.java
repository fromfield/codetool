package com.from.codetool.tool;

/**
 * @author fromfield
 **/

public class Sort {

    public static void main(String[] args){
        int[] r = Struct.r;
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
    private static int[] bubbleSort0(int[] is){
        int count = 0;
        for(int i = 0; i < is.length; i++){
            for(int j = i + 1; j < is.length; j++){
                count++;
                if(is[j] < is[i]){
                    Struct.swqp(is, i, j);
                }
            }
        }
        System.out.println("count="+count);
        return is;
    }

    /**冒泡排序*/
    private static int[] bubbleSort1(int[] is){
        int count = 0;
        for(int i = 0; i < is.length; i++){
            for(int j = is.length-1; j > i; j--){
                count++;
                if(is[j-1] > is[j]){
                    Struct.swqp(is, j-1, j);
                }
            }
        }
        System.out.println("count="+count);
        return is;
    }

    /**冒泡排序优化(可以避免因已经有序的情况下的无意义循环判断。{2,1,3,4,5,6,7,8,9})*/
    private static int[] bubbleSort2(int[] is){
        boolean flag = true;
        int count = 0;
        for(int i = 0; i < is.length; i++){
            if(!flag){
                flag = true;
                continue;
            }
            flag = false;
            for(int j = is.length - 1; j > i; j--){
                count++;
                if(is[j] < is[j-1]){
                    Struct.swqp(is, j-1, j);
                    flag = true;
                }
            }
        }
        System.out.println("count="+count);
        return is;
    }
}
