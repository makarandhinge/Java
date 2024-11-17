package org.example.CodeVita;

import java.util.*;

public class CardBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of cards
        sc.nextLine();

        // Store the cards with their coordinates and orientation
        Set<String> cards = new HashSet<>();
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextLine().trim());
        }

        // Find the bounding box
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, minZ = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxZ = Integer.MIN_VALUE;

        for (String card : cards) {
            String[] parts = card.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            int z = Integer.parseInt(parts[2]);

            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            minZ = Math.min(minZ, z);
            maxX = Math.max(maxX, x + 1);
            maxY = Math.max(maxY, y + 1);
            maxZ = Math.max(maxZ, z + 1);
        }

        // Check if the box is closed
        List<String> missingCards = new ArrayList<>();
        for (int x = minX; x < maxX; x++) {
            for (int y = minY; y < maxY; y++) {
                for (int z = minZ; z < maxZ; z++) {
                    if (!cards.contains(x + " " + y + " " + z + " xy")) {
                        missingCards.add(x + " " + y + " " + z + " xy");
                    }
                    if (!cards.contains(x + " " + y + " " + z + " xz")) {
                        missingCards.add(x + " " + y + " " + z + " xz");
                    }
                    if (!cards.contains(x + " " + y + " " + z + " yz")) {
                        missingCards.add(x + " " + y + " " + z + " yz");
                    }
                }
            }
        }

        if (missingCards.isEmpty()) {
            // Calculate the volume of the box
            int volume = (maxX - minX) * (maxY - minY) * (maxZ - minZ);
            System.out.println(volume);
        } else {
            // Output the missing card
            System.out.println(missingCards.get(0));
        }

        sc.close();
    }
}

