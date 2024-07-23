package Demo;

import TechnicalLecture.Vec;

import javax.swing.tree.TreeNode;
import java.util.*;

public class Demo{

    public static void main(String[] args) {


                // Create and populate a HashMap
                HashMap<Integer, String> hashMap = new HashMap<>();
                hashMap.put(1, "Apple");
                hashMap.put(2, "Banana");
                hashMap.put(3, "Apple");
                hashMap.put(4, "Orange");
                hashMap.put(5, "Banana");
                hashMap.put(6, "Grape");

                // Create a HashMap to store values and corresponding keys
                HashMap<String, List<Integer>> valueToKeysMap = new HashMap<>();

                // Populate the valueToKeysMap
                for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
                    String value = entry.getValue();
                    Integer key = entry.getKey();

                    // Get the list of keys for this value, or create a new list if none exists
                    List<Integer> keys = valueToKeysMap.getOrDefault(value, new ArrayList<>());

                    // Add the key to the list
                    keys.add(key);

                    // Put the updated list back into the map
                    valueToKeysMap.put(value, keys);
                }

                // Print the values and corresponding keys
                for (Map.Entry<String, List<Integer>> entry : valueToKeysMap.entrySet()) {
                    String value = entry.getKey();
                    List<Integer> keys = entry.getValue();

                    // Only print values that have more than one key associated with them
                    if (keys.size() > 1) {
                        System.out.println("Value: " + value + " has keys: " + keys);
                    }
                }
            }
        }


