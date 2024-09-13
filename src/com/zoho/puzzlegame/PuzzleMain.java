package com.zoho.puzzlegame;

import java.util.*;

import static com.zoho.puzzlegame.PuzzleImplementation.*;

public class PuzzleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = generateRandomPuzzle();
        printValue(array);

        int[][] originalArray = {{1, 2, 3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,0}};

        while (!Arrays.deepEquals(array, originalArray)){
            int[] searchZeroSpace = searchValueOfSpace(0, array);
            ArrayList<String> findMoves = findMovesPossiblities(searchZeroSpace[0],searchZeroSpace[1], array.length);
            int serial_no=1;
            for(int i = 0;i<findMoves.size();i++){
                System.out.print(serial_no+"."+findMoves.get(i)+" ");serial_no++;
            }
        System.out.println();
            try {
            System.out.println("Enter Value from 1 to "+findMoves.size()+" :");
            int moves = scanner.nextInt();

                if(findMoves.get(moves-1).equals("Up")){
                    callUp(array,searchZeroSpace[0],searchZeroSpace[1]);
                }
                else if(findMoves.get(moves-1).equals("Down")){
                    CallDown(array,searchZeroSpace[0],searchZeroSpace[1]);
                }
                else if(findMoves.get(moves-1).equals("Right")){
                    CallRight(array,searchZeroSpace[0],searchZeroSpace[1]);
                }
                else if(findMoves.get(moves-1).equals("Left")){
                    callLeft(array,searchZeroSpace[0],searchZeroSpace[1]);
                }

            }
            catch (IndexOutOfBoundsException e){
                System.out.println("Invalid Move");
            }
         }
        System.out.println("GAME OVER");


    }
}
