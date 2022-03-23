package com;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test01
{
    public static void main(String[] args) {
       int [][]arr={{1,2,8,9},{3,4,9,12},{5,7,10,13},{6,8,11,15}};
        Find(8,arr);

    }
    public static boolean Find(int target, int [][] array) {
        if (Arrays.toString(array)=="[[]]"){
            return false;
        }
        int indexY=0;
        int indexX=0;
        for (int i = 0; i <array.length ; i++) {
            if (target==array[i][array[0].length-1]){return true;}
            if (target==array[i][0]){
                return true;
            }
            if (target<array[i][0]){
                indexY=i;
                break;
            }
            if(i==array.length-1){
                indexY=i;
                break;
            }
        }
        for (int i = 0; i <array[0].length ; i++) {
            if (target==array[array.length-1][i]){return true;}
            if (target==array[0][i]){
                return true;
            }
            if (target<array[0][i]){
                indexX=i;
                break;
            }
            if(i==array[0].length-1){
                indexX=i;
                break;
            }
        }


        System.out.println(indexX);
        System.out.println(indexY);
        System.out.println(array[indexY-1][indexX-1]);

     return false;
    }
}
