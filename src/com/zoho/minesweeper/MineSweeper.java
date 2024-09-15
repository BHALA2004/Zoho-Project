package com.zoho.minesweeper;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MineSweeper {
    static int rows =5;
    static int columns = 6;
    static int bombCount = 5;
    static int[][] currentBoard = new int[rows][columns];
    static int[][] FullBoard = new int[rows][columns];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[][] visited = new boolean[rows][columns];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<columns;j++){
                visited[i][j]=false;
            }
        }

        MineSweeperImplementation.start(currentBoard,FullBoard,bombCount);
        MineSweeperImplementation.print(currentBoard);
        while (!Arrays.deepEquals(currentBoard,FullBoard)){
            try {
            System.out.println("Enter the Grid Row Value from 1 to " + String.valueOf(rows) +":");
            int rowValue = scanner.nextInt();
            rowValue-=1;
            System.out.println("Enter the Grid Column Value from 1 to " + String.valueOf(columns) +":");
            int columnValue = scanner.nextInt();
            columnValue-=1;
            if(!visited[rowValue][columnValue]){
                if(FullBoard[rowValue][columnValue]==66){
                    System.out.println("Game Over");
                    MineSweeperImplementation.print(FullBoard);
                    break;
                } else {
                    MineSweeperImplementation.revealMultipleTiles(rowValue, columnValue, currentBoard, FullBoard, visited);
                    MineSweeperImplementation.print(currentBoard);
                }
                if(MineSweeperImplementation.checkWon(currentBoard,bombCount)){
                    System.out.println("You Won The Match");
                    MineSweeperImplementation.print(FullBoard);
                    break;
                }

            } else {
                System.out.println("Already This Tile is Visited");
            }}
            catch (Exception e){
                System.out.println("Invalid input");
            }



        }


    }
}
