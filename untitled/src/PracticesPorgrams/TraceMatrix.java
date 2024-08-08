package PracticesPorgrams;

import java.util.Scanner;

public class TraceMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[][] A = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            int maxTrace = Integer.MIN_VALUE; //-2147483648

            for (int l = 1; l <= N; l++) {
                for (int r = 0; r <= N - l; r++) {
                    for (int c = 0; c <= N - l; c++) {
                        int trace = 0;
                        for (int k = 0; k < l; k++) {
                            trace += A[r + k][c + k];
                        }
                        maxTrace = Math.max(maxTrace, trace);
                    }
                }
            }

            System.out.println(maxTrace);
        }

        sc.close();
    }
}

