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

        System.out.print(minMoves);
        sc.close();
    }
}

/*DanceRev
Problem Description
Dance Revolution is the pioneering series of the rhythm and dance genre in video games

The core games involve placing your feet on certain tile according to the instruction on screen.

Here you will have four tiles up, down, right, and left. You can move your leg one at time. Initially you can place your feet at any tile. Instructions will contain the list of tiles, where you must place one of your feet, one instruction after another.

Given the instruction to place your feet, find the minimum number of times you must move your legs to different titles following the instruction. You can start with placing your legs at any position.

Constraints
1<= N <= 80

Input
First line consists of single integer N representing total number of instructions

Next N lines consist of the instructions.

Output
Single integer representing minimum number of times you must move your legs

Time Limit (secs)
1

Examples
Example 1

Input

6

down

right

down

up

right

down

Output

2

Explanation

Assume you initially you started with your legs on tiles down and right.

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@6928f576:image1.png

Minimum 2 times you must move your leg to follow the instruction.

Example 2

Input

8

up

right

down

up

up

down

right

left

Output

3

Explanation

Assume you are starting with legs at tiles up and right.

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@6928f576:image2.png

From the table you see, you had to move your legs three times, that is the minimum times will be required to follow the instructions.
* */