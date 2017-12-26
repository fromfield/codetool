package com.from.codetool.tool;

/**
 * @author fromfield
 **/

public class InsertSort {
    public static void main(String[] args){
        int[] r = Struct.r;
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
        r = insertSort(r);
        System.out.println();
        for(int i : r){
            System.out.print(i);
            System.out.print(",");
        }
    }

    private static int[] insertSort(int[] is){
        int i, j;
        for(i = 1; i < is.length; i++){
            if(is[i] < is[i - 1]){
                is[0] = is[i];
                for(j = i - 1; is[j] > is[0]; j--){
                    is[j + 1] = is[j];
                }
                is[j + 1] = is[0];
            }
        }
        return is;
    }
}
