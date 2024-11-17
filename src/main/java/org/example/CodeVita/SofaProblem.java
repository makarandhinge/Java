package org.example.CodeVita;


import java.util.*;

public class SofaProblem {

    private static final char SOFA_START = 's';
    private static final char SOFA_END = 'S';
    private static final char HOUSEHOLD_ITEM = 'H';
    private static final char EMPTY_SPACE = '0';

    private static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Up, Down, Left, Right

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        char[][] house = new char[M][N];
        for (int i = 0; i < M; i++) {
            house[i] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }

        int minSteps = findMinSteps(house);
        if (minSteps == Integer.MAX_VALUE) {
            System.out.println("Impossible");
        } else {
            System.out.println(minSteps);
        }
    }

    private static int findMinSteps(char[][] house) {
        int M = house.length;
        int N = house[0].length;
        Queue<State> queue = new LinkedList<>();
        boolean[][][][] visited = new boolean[M][N][M][N];

        // Find the starting position of the sofa
        int startX1 = -1, startY1 = -1, startX2 = -1, startY2 = -1;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] == SOFA_START) {
                    if (startX1 == -1) {
                        startX1 = i;
                        startY1 = j;
                    } else {
                        startX2 = i;
                        startY2 = j;
                    }
                }
            }
        }

        queue.offer(new State(startX1, startY1, startX2, startY2, 0));
        markVisited(visited, startX1, startY1, startX2, startY2);

        while (!queue.isEmpty()) {
            State curr = queue.poll();

            // Check if reached the destination
            if (house[curr.x1][curr.y1] == SOFA_END && house[curr.x2][curr.y2] == SOFA_END) {
                return curr.steps;
            }

            // Try moving the sofa in all four directions
            for (int[] dir : directions) {
                int newX1 = curr.x1 + dir[0];
                int newY1 = curr.y1 + dir[1];
                int newX2 = curr.x2 + dir[0];
                int newY2 = curr.y2 + dir[1];

                if (isValidMove(house, newX1, newY1, newX2, newY2) &&
                        !isVisited(visited, newX1, newY1, newX2, newY2)) {
                    queue.offer(new State(newX1, newY1, newX2, newY2, curr.steps + 1));
                    markVisited(visited, newX1, newY1, newX2, newY2);
                }
            }

            // Try rotating the sofa if possible (both clockwise and counter-clockwise)
            if (canRotate(house, curr.x1, curr.y1, curr.x2, curr.y2)) {
                // Clockwise rotation
                int newX1 = curr.x1;
                int newY1 = curr.y1;
                int newX2 = curr.x1 + (curr.y2 - curr.y1);
                int newY2 = curr.y1 + (curr.x1 - curr.x2);
                if (isValidMove(house, newX1, newY1, newX2, newY2) &&
                        !isVisited(visited, newX1, newY1, newX2, newY2)) {
                    queue.offer(new State(newX1, newY1, newX2, newY2, curr.steps + 1));
                    markVisited(visited, newX1, newY1, newX2, newY2);
                }

                // Counter-clockwise rotation
                newX1 = curr.x1 + (curr.y2 - curr.y1);
                newY1 = curr.y1 + (curr.x1 - curr.x2);
                newX2 = curr.x2;
                newY2 = curr.y2;
                if (isValidMove(house, newX1, newY1, newX2, newY2) &&
                        !isVisited(visited, newX1, newY1, newX2, newY2)) {
                    queue.offer(new State(newX1, newY1, newX2, newY2, curr.steps + 1));
                    markVisited(visited, newX1, newY1, newX2, newY2);
                }
            }
        }

        return Integer.MAX_VALUE; // Impossible to reach the destination
    }

    private static boolean isValidMove(char[][] house, int x1, int y1, int x2, int y2) {
        int M = house.length;
        int N = house[0].length;
        return x1 >= 0 && x1 < M && y1 >= 0 && y1 < N &&
                x2 >= 0 && x2 < M && y2 >= 0 && y2 < N &&
                house[x1][y1] != HOUSEHOLD_ITEM && house[x2][y2] != HOUSEHOLD_ITEM;
    }

    private static boolean canRotate(char[][] house, int x1, int y1, int x2, int y2) {
        int M = house.length;
        int N = house[0].length;
        int[] dx = {-1, -1, 1, 1};
        int[] dy = {-1, 1, -1, 1};

        for (int i = 0; i < 4; i++) {
            int newX = x1 + dx[i];
            int newY = y1 + dy[i];
            if (newX >= 0 && newX < M && newY >= 0 && newY < N &&
                    house[newX][newY] != HOUSEHOLD_ITEM) {
                return true;
            }
        }
        return false;
    }

    private static boolean isVisited(boolean[][][][] visited, int x1, int y1, int x2, int y2) {
        return visited[x1][y1][x2][y2] || visited[x2][y2][x1][y1];
    }

    private static void markVisited(boolean[][][][] visited, int x1, int y1, int x2, int y2) {
        visited[x1][y1][x2][y2] = true;
        visited[x2][y2][x1][y1] = true;
    }

    private static class State {
        int x1, y1, x2, y2;
        int steps;

        public State(int x1, int y1, int x2, int y2, int steps) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.steps = steps;
        }
    }
}