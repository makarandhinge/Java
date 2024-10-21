package org.example.DataStructure.Backtracking;

public class NQueens {
    private int[] queens;
    private int N;

    public NQueens(int N) {
        queens = new int[N];
        this.N = N;
    }

    public void placeNQueens() {
        if (placeQueen(0)) {
            printQueens();
        } else {
            System.out.println("No solution found");
        }
    }

    private boolean placeQueen(int col) {
        if (col == N) {
            return true; // All queens are placed successfully
        }

        for (int row = 0; row < N; row++) {
            if (canPlace(row, col)) {
                queens[col] = row; // Place queen
                if (placeQueen(col + 1)) { // Recurse; move to next column
                    return true; // Found a valid placement
                }
                // If no valid placement found, unplace current queen and backtrack
            }
        }

        return false; // No valid placement found for current column
    }

    private boolean canPlace(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (queens[i] == row || Math.abs(queens[i] - row) == Math.abs(i - col)) {
                return false; // Queen cannot be placed here
            }
        }
        return true; // It is safe to place the queen here
    }

    private void printQueens() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens(8);
        nQueens.placeNQueens();
    }
}


/*Algorithm placeNQueens(N):
    Initialize queens[] array of size N
    Call placeQueen(column = 0)

Function placeQueen(col):
    If col == N:
        Print queens[] as a solution
        Return true

    For each row from 0 to N-1:
        If canPlace(row, col):
            Place queen in (row, col)
            If placeQueen(col + 1) succeeds:
                Return true
            Else:
                Remove queen (backtrack)

    Return false  // If no valid position found in this column

Function canPlace(row, col):
    For each previously placed queen in columns 0 to col-1:
        If queen in the same row or on the same diagonal:
            Return false
    Return true  // It's safe to place the queen here
*/