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
        if(searchZeroSpace[0]==0 && searchZeroSpace[1]==0){
            System.out.println("1.Down  2.Right");
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
            }
        }
        else if(searchZeroSpace[0]==0 && searchZeroSpace[1]==1){
                System.out.println("1.Down  2.Right  3.Left" );
                System.out.println("Enter Value:");
                int getPossiblities = scanner.nextInt();
                int rowIndexOfSpace = searchZeroSpace[0];
                int colIndexOfSpace = searchZeroSpace[1];
                switch (getPossiblities){
                    case 1:
                        swap(array,rowIndexOfSpace,colIndexOfSpace,rowIndexOfSpace+1,colIndexOfSpace);
                        printValue(array);
                        break;
                    case 2:
                        swap(array,rowIndexOfSpace,colIndexOfSpace,rowIndexOfSpace,colIndexOfSpace+1);
                        printValue(array);
                        break;
                    case 3:
                        swap(array,rowIndexOfSpace,colIndexOfSpace,rowIndexOfSpace,colIndexOfSpace-1);
                        printValue(array);break;
                }
            }
        else if(searchZeroSpace[0]==0 && searchZeroSpace[1]==2){
            System.out.println("1.Down  2.Right  3.Left" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace -1);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==0 && searchZeroSpace[1]==3){
            System.out.println(" 1.Down  2.Left" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfspace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfspace, rowIndexOfSpace +1, colIndexOfspace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfspace, rowIndexOfSpace, colIndexOfspace -1);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==1 && searchZeroSpace[1]==0){
            System.out.println("1.Down  2.Right  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==1 && searchZeroSpace[1]==1){
            System.out.println("1.Down  2.Right  3.Left  4.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 4:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }
        else if(searchZeroSpace[0]==1 && searchZeroSpace[1]==2){
            System.out.println("1.Down  2.Right  3.Left  4.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 4:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==1 && searchZeroSpace[1]==3){
            System.out.println("1.Down   2.Left  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==2 && searchZeroSpace[1]==0){
            System.out.println("1.Down  2.Right  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfspace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfspace, rowIndexOfSpace +1, colIndexOfspace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfspace, rowIndexOfSpace, colIndexOfspace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfspace, rowIndexOfSpace -1, colIndexOfspace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==2 && searchZeroSpace[1]==1){
            System.out.println("1.Down  2.Right  3.Left  4.Up" );
            System.out.println("Enter Value:");
            int getPossiblites = scanner.nextInt();
            int rowIndexofSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblites){
                case 1:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 4:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }
        else if(searchZeroSpace[0]==2 && searchZeroSpace[1]==2){
            System.out.println("1.Down  2.Right  3.Left  4.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexofSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace +1, colIndexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 4:
                    swap(array, rowIndexofSpace, colIndexOfSpace, rowIndexofSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }


        else if(searchZeroSpace[0]==2 && searchZeroSpace[1]==3){
            System.out.println("1.Down   2.Left  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colindexOfspace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colindexOfspace, rowIndexOfSpace +1, colindexOfspace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colindexOfspace, rowIndexOfSpace, colindexOfspace -1);
                    printValue(array);break;
                case 3:
                    swap(array, rowIndexOfSpace, colindexOfspace, rowIndexOfSpace -1, colindexOfspace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==3 && searchZeroSpace[1]==0){
            System.out.println("1.Down  2.Right  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexofspace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexofspace, rowIndexOfSpace +1, colIndexofspace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexofspace, rowIndexOfSpace, colIndexofspace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexofspace, rowIndexOfSpace -1, colIndexofspace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==3 && searchZeroSpace[1]==1){
            System.out.println("1.Down  2.Right  3.Left  4.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexofSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace +1, colIndexofSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace, colIndexofSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace, colIndexofSpace -1);
                    printValue(array);break;
                case 4:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace -1, colIndexofSpace);
                    printValue(array);break;
            }
        }
        else if(searchZeroSpace[0]==3 && searchZeroSpace[1]==2){
            System.out.println("1.Down  2.Right  3.Left  4.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexofSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace +1, colIndexofSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace, colIndexofSpace +1);
                    printValue(array);
                    break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace, colIndexofSpace -1);
                    printValue(array);break;
                case 4:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace -1, colIndexofSpace);
                    printValue(array);break;
            }
        }


        else if(searchZeroSpace[0]==3 && searchZeroSpace[1]==3){
            System.out.println("1.Down   2.Left  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colindexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colindexOfSpace, rowIndexOfSpace +1, colindexOfSpace);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colindexOfSpace, rowIndexOfSpace, colindexOfSpace -1);
                    printValue(array);break;
                case 3:
                    swap(array, rowIndexOfSpace, colindexOfSpace, rowIndexOfSpace -1, colindexOfSpace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==4 && searchZeroSpace[1]==0){
            System.out.println("  1.Right   2.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }

        else if(searchZeroSpace[0]==4 && searchZeroSpace[1]==1){
            System.out.println(" 1.Right  2.Left  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace +1);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }
        else if(searchZeroSpace[0]==4 && searchZeroSpace[1]==2){
            System.out.println(" 1.Right  2.Left  3.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexofSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace, colIndexofSpace +1);
                    printValue(array);
                    break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace, colIndexofSpace -1);
                    printValue(array);break;
                case 3:
                    swap(array, rowIndexOfSpace, colIndexofSpace, rowIndexOfSpace -1, colIndexofSpace);
                    printValue(array);break;
            }
        }


        else if(searchZeroSpace[0]==4 && searchZeroSpace[1]==3){
            System.out.println(" 1.Left  2.Up" );
            System.out.println("Enter Value:");
            int getPossiblities = scanner.nextInt();
            int rowIndexOfSpace = searchZeroSpace[0];
            int colIndexOfSpace = searchZeroSpace[1];
            switch (getPossiblities){
                case 1:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace, colIndexOfSpace -1);
                    printValue(array);break;
                case 2:
                    swap(array, rowIndexOfSpace, colIndexOfSpace, rowIndexOfSpace -1, colIndexOfSpace);
                    printValue(array);break;
            }
        }



        }
        System.out.println("GAME OVER");


    }
}
