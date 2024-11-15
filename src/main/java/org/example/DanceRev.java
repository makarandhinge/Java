package org.example;

import java.util.*;

public class DanceRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of instructions
        String[] instructions = new String[N];
        for (int i = 0; i < N; i++) {
            instructions[i] = sc.next();
        }

        // Tiles represented as indices: 0 -> up, 1 -> down, 2 -> left, 3 -> right
        Map<String, Integer> tileIndex = Map.of("up", 0, "down", 1, "left", 2, "right", 3);
        int[][][] dp = new int[N + 1][4][4]; // DP array

        // Initialize DP array with a large number
        for (int[][] arr : dp) {
            for (int[] row : arr) {
                Arrays.fill(row, Integer.MAX_VALUE);
            }
        }

        // Base case: Start with any two different tiles
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) dp[0][i][j] = 0;
            }
        }

        // Fill DP table
        for (int i = 0; i < N; i++) {
            int target = tileIndex.get(instructions[i]);
            for (int l1 = 0; l1 < 4; l1++) {
                for (int l2 = 0; l2 < 4; l2++) {
                    if (l1 == l2) continue; // Feet can't occupy the same tile

                    // Move left foot to the target
                    if (dp[i][l1][l2] != Integer.MAX_VALUE) {
                        dp[i + 1][target][l2] = Math.min(dp[i + 1][target][l2], dp[i][l1][l2] + (l1 == target ? 0 : 1));
                        // Move right foot to the target
                        dp[i + 1][l1][target] = Math.min(dp[i + 1][l1][target], dp[i][l1][l2] + (l2 == target ? 0 : 1));
                    }
                }
            }
        }

        // Find the minimum number of moves from the last instruction
        int minMoves = Integer.MAX_VALUE;
        for (int l1 = 0; l1 < 4; l1++) {
            for (int l2 = 0; l2 < 4; l2++) {
                if (l1 != l2) {
                    minMoves = Math.min(minMoves, dp[N][l1][l2]);
                }
            }
        }

        System.out.println(minMoves);
        sc.close();
    }
}
