package com.from.codetool.tool;

/**
 * @author fromfield
 * @create 2017-12-22 10:06
 **/

public class BinarySrarch {
    public static void main(String[] args){
        int key = 77;
        int[] ints = {1,3,7,9,20,30,50,52,77,63};
        int low = 0;
        int high = ints.length;
        int count = 0;
        while(low < high){
            int mid = (high + low)/2;
            count++;
//            int mid=low + ((key-ints[low]) / (ints[high]-ints[low])) * (high-low);
            int now = ints[mid];
            if(now > key){
                high = mid - 1;
            }else if(now < key){
                low = mid + 1;
            }else {
                System.out.println(count);
                System.out.println(key);
                System.exit(0);
            }
        }
    }
}
