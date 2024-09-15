package com.zoho.minesweeper;

import java.util.ArrayList;
import java.util.Random;

public class MineSweeperImplementation {

    public static void revealMultipleTiles(int row, int col, int[][] currentBoard, int[][] FullBoard, boolean[][] visited) {

        if (row < 0 || row >= currentBoard.length || col < 0 || col >= currentBoard[0].length || visited[row][col]) {
            return;
        }


        visited[row][col] = true;


        currentBoard[row][col] = FullBoard[row][col];


        if (FullBoard[row][col] != 0) {
            return;
        }


        revealMultipleTiles(row - 1, col, currentBoard, FullBoard, visited);    // Up
        revealMultipleTiles(row + 1, col, currentBoard, FullBoard, visited);    // Down
        revealMultipleTiles(row, col - 1, currentBoard, FullBoard, visited);    // Left
        revealMultipleTiles(row, col + 1, currentBoard, FullBoard, visited);    // Right
        revealMultipleTiles(row - 1, col - 1, currentBoard, FullBoard, visited); // Up-Left
        revealMultipleTiles(row - 1, col + 1, currentBoard, FullBoard, visited); // Up-Right
        revealMultipleTiles(row + 1, col - 1, currentBoard, FullBoard, visited); // Down-Left
        revealMultipleTiles(row + 1, col + 1, currentBoard, FullBoard, visited); // Down-Right
    }


    public static void print(int[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==66){
                    System.out.print((char) board[i][j]+" ");
                }
                else if(board[i][j]==45){
                    System.out.print((char) board[i][j]+" ");
                }
                else {
                    System.out.print(board[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static ArrayList<String> findmoves(int row,int column,int rowlength,int columnLength){
        ArrayList<String> arrayList = new ArrayList<>();
        if(row-1!=-1){
            arrayList.add("Up");
        }
        if(row+1!=rowlength){
            arrayList.add("Down");
        }
        if(column-1!=-1){
            arrayList.add("Left");
        }
        if(column+1!=columnLength){
            arrayList.add("Right");
        }
        if(arrayList.contains("Up") && arrayList.contains("Left")){
            arrayList.add("Up_Left");
        }
        if(arrayList.contains("Up") && arrayList.contains("Right")){
            arrayList.add("Up_Right");
        }
        if(arrayList.contains("Down") && arrayList.contains("Left")){
            arrayList.add("Down_Left");
        }
        if(arrayList.contains("Down") && arrayList.contains("Right")){
            arrayList.add("Down_Right");
        }
        return arrayList;

    }

    public static int search(int row,int column,int[][] fullBoard,char c){
        if(fullBoard[row][column]=='B'){
            return 1;
        }
        return 0;
    }

    public static int assignValue(ArrayList<String> probs,int row,int column,int[][] FullBoard){
        int count  = 0;
        for(String str : probs){
            if(str.equals("Up")){
                count+=search(row-1,column,FullBoard,'B');
            }
            if(str.equals("Down")){
                count+=search(row+1,column,FullBoard,'B');
            }
            if(str.equals("Left")){
                count+=search(row,column-1,FullBoard,'B');
            }
            if(str.equals("Right")){
                count+=search(row,column+1,FullBoard,'B');
            }
            if(str.equals("Up_Left")){
                count+=search(row-1,column-1,FullBoard,'B');
            }
            if(str.equals("Up_Right")){
                count+=search(row-1,column+1,FullBoard,'B');
            }
            if(str.equals("Down_Left")){
                count+=search(row+1,column-1,FullBoard,'B');
            }
            if(str.equals("Down_Right")){
                count+=search(row+1,column+1,FullBoard,'B');
            }
        }
        return count;
    }

    public static void start(int[][] currentBoard,int[][] FullBoard,int bombCount){
        boolean[][] checkBooleantile = new boolean[currentBoard.length][currentBoard[0].length];
        for(int i = 0;i<currentBoard.length;i++){
            for(int j = 0;j<currentBoard[0].length;j++){
                currentBoard[i][j]='-';
                checkBooleantile[i][j]=false;
            }
        }
        int initial = 0;
        Random random = new Random();
        while (initial<bombCount){
            int rows = random.nextInt(currentBoard.length);
            int columns = random.nextInt(currentBoard[0].length);
            if(!checkBooleantile[rows][columns]){
                FullBoard[rows][columns]='B';
                checkBooleantile[rows][columns]=true;
                initial++;
            }
        }

        for(int i = 0;i<FullBoard.length;i++){
            for(int j = 0;j<FullBoard[0].length;j++){
                if(FullBoard[i][j]!='B'){
                    ArrayList<String> findProbs = findmoves(i,j,FullBoard.length,FullBoard[0].length);
                    int value = assignValue(findProbs,i,j,FullBoard);
                    FullBoard[i][j]=value;
                }

            }
        }
    }

}
