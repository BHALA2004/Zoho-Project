package com.zoho.puzzlegame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleImplementation {
    public static void printValue(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i][j]>9){
                    System.out.print(arr[i][j]+"     ");
                }
                else {
                    System.out.print(arr[i][j]+"      ");
                }
            }
            System.out.println();
        }

    }

    public static void swap(int[][] arr, int oldrow, int oldcol, int newrow, int newcol){
        int temporaryValue =arr[oldrow][oldcol];
        arr[oldrow][oldcol]=arr[newrow][newcol];
        arr[newrow][newcol]= temporaryValue;
    }

    public static int[][] generateRandomPuzzle() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        int[][] arr = new int[4][4];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = numbers.get(index++);
            }
        }
        return arr;
    }
    public static int[] searchValueOfSpace(int x, int[][] arr){
        int[] newarr = new int[2];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(x==arr[i][j]){
                    newarr[0]=i;
                    newarr[1]=j;break;
                }
            }
        }
        return newarr;
    }
}
