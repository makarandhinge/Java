package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt(); // Number of children
        int m = sc.nextInt(); // Number of ice creams
        int[] cravings = new int[n];
        int[] sizes = new int[m];

        // Read the cravings array
        for (int i = 0; i < n; i++) {
            cravings[i] = sc.nextInt();
        }

        // Read the sizes array
        for (int i = 0; i < m; i++) {
            sizes[i] = sc.nextInt();
        }

        // Sort both arrays
        Arrays.sort(cravings);
        Arrays.sort(sizes);

        // Two pointers approach to maximize satisfied children
        int childPointer = 0, iceCreamPointer = 0, satisfiedChildren = 0;

        while (childPointer < n && iceCreamPointer < m) {
            if (sizes[iceCreamPointer] >= cravings[childPointer]) {
                // Satisfy this child
                satisfiedChildren++;
                childPointer++; // Move to the next child
            }
            // Move to the next ice cream
            iceCreamPointer++;
        }

        // Output the maximum number of children who can be satisfied
        System.out.println(satisfiedChildren);
    }
}

