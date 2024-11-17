package org.example.CodeVita;

import java.util.*;

public class Bands {

    private static final char BAND1 = '1';
    private static final char BAND2 = '2';
    private static final char EMPTY = '.';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[][] caseMatrix = new char[S][S];
        for (int i = 0; i < S; i++) {
            caseMatrix[i] = scanner.nextLine().toCharArray();
        }

        int overlaps = checkBands(caseMatrix);
        if (overlaps == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(overlaps);
        }
    }

    private static int checkBands(char[][] caseMatrix) {
        int S = caseMatrix.length;
        int overlaps = 0;
        boolean[][] visited = new boolean[S][S];

        for (int i = 0; i < S; i++) {
            for (int j = 0; j < S; j++) {
                if ((caseMatrix[i][j] == BAND1 || caseMatrix[i][j] == BAND2) && !visited[i][j]) {
                    if (!isValidBand(caseMatrix, visited, i, j)) {
                        return -1; // Interlocked, impossible to separate
                    }
                    overlaps++;
                }
            }
        }

        return overlaps;
    }

    private static boolean isValidBand(char[][] caseMatrix, boolean[][] visited, int row, int col) {
        int S = caseMatrix.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        visited[row][col] = true;
        char bandType = caseMatrix[row][col];

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];

            // Check adjacent cells (up, down, left, right)
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] dir : directions) {
                int newRow = i + dir[0];
                int newCol = j + dir[1];

                if (newRow >= 0 && newRow < S && newCol >= 0 && newCol < S &&
                        !visited[newRow][newCol] && caseMatrix[newRow][newCol] != EMPTY) {

                    // Check for invalid conditions (interlocking)
                    if (caseMatrix[newRow][newCol] != bandType && isAdjacent(i, j, newRow, newCol)) {
                        return false; // Interlocked
                    }

                    if (caseMatrix[newRow][newCol] == bandType) {
                        queue.offer(new int[]{newRow, newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }
        }

        return true; // Not interlocked
    }

    private static boolean isAdjacent(int i1, int j1, int i2, int j2) {
        // Check if the two cells are adjacent horizontally or vertically
        return (Math.abs(i1 - i2) == 1 && j1 == j2) || (i1 == i2 && Math.abs(j1 - j2) == 1);
    }
}