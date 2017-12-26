package com.from.codetool.tool;

/**
 * @author fromfield
 **/

public class SelectSort {
    public static void main(String[] args){
        int[] r = Struct.r;
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
        r = selectSort(r);
        System.out.println();
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
    }

    private static int[] selectSort(int[] is){
        int min, count = 0;
        for(int i = 0; i < is.length; i++){
            min = i;
            count++;
            for(int j = i + 1; j < is.length; j++){
                if(is[min] > is[j]){
                    min = j;
                }
            }
            if(i != min){
                Struct.swqp(is, i , min);
            }
        }
        System.out.println("count;"+count);
        return is;
    }
}
