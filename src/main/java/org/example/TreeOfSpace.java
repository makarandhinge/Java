package org.example;

import java.util .*;
public class TreeOfSpace {

    static class TreeNode {
        String name;
        boolean isLocked;
        int id;
        TreeNode parent;
        int anc_locked;
        int des_locked;
        ArrayList<TreeNode> children = new ArrayList<>();

        TreeNode(String name, TreeNode parent) {
            this.name = name;
            this.parent = parent;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

// Reading the number of nodes, children per node, and number of queries
            int N = sc.nextInt();
            int M = sc.nextInt();
            int Q = sc.nextInt();
            sc.nextLine(); // Consume newline

// Reading the nodes
            Map<String, TreeNode> map = new HashMap<>();
            TreeNode root = new TreeNode(sc.nextLine(), null);
            map.put(root.name, root);

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int ind = 1;

            while (!queue.isEmpty() && ind < N) {
                TreeNode parentNode = queue.poll();
                for (int i = 0; i < M && ind < N; i++) {
                    TreeNode childNode = new TreeNode(sc.nextLine(), parentNode);
                    parentNode.children.add(childNode);
                    map.put(childNode.name, childNode);
                    queue.add(childNode);
                    ind++;
                }
            }


// Reading the queries and processing them
            for (int i = 0; i < Q; i++) {
                String[] parts = sc.nextLine().split("");
                int operation = Integer.parseInt(parts[0]);
                String nodeName = parts[1];
                int userld = Integer.parseInt(parts[2]);

                boolean result = false;
                TreeNode node = map.get(nodeName);
                if (operation == 1) {
                    result = lock(node, userld);
                } else if (operation == 2) {
                    result = unlock(node, userld);
                } else if (operation == 3) {
                    result = upgrade(node, userld);
                }
                System.out.println(result);
            }
            sc.close();
        }

        static boolean lock(TreeNode node, int id) {
            if (node.isLocked)
                return false;
            if (node.anc_locked > 0 || node.des_locked > 0)
                return false;

            TreeNode cur = node.parent;
            while (cur != null) {
                cur.des_locked += 1;
                cur = cur.parent;

            }

            informDescendant(node, 1);
            node.isLocked = true;
            node.id = id;

            return true;

        }

        static void informDescendant(TreeNode node, int val) {
            if (node == null) return;
            node.anc_locked += val;
            for (TreeNode child : node.children) {
                informDescendant(child, val);


            }

        }

        static boolean unlock(TreeNode node, int id) {
            if (!node.isLocked || node.id != id)
                return false;

            TreeNode cur = node.parent;
            while (cur != null) {
                cur.des_locked -= 1;
                cur = cur.parent;

            }

            informDescendant(node, -1);
            node.isLocked = false;
            node.id = 0;

            return true;
        }

        static boolean upgrade(TreeNode node, int id) {
            if (node.isLocked || node.anc_locked > 0 || node.des_locked == 0)
                return false;

            List<TreeNode> lockedDescendants = new ArrayList<>();
            if (!collectLockedDescendants(node, lockedDescendants, id)) {
                return false;
            }
            for (TreeNode descendant : lockedDescendants) {
                unlock(descendant, id);

            }

            TreeNode cur = node.parent;
            while (cur != null) {
                cur.des_locked += 1;
                cur = cur.parent;

            }

            informDescendant(node, 1);
            node.isLocked = true;
            node.id = id;

            return true;
        }

        static boolean collectLockedDescendants(TreeNode node, List<TreeNode> lockedDescendants, int id) {
            if (node == null) return true;
            if (node.isLocked) {
                if (node.id != id) {
                    return false;

                }
                lockedDescendants.add(node);

            }

            for (TreeNode child : node.children) {
                if (!collectLockedDescendants(child, lockedDescendants, id)) {
                    return false;

                }
            }
            return true;

        }
    }
}