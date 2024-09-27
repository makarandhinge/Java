package org.example.DataStructure.Tree;

public class Main {

    public static void main(String[] args){
        TreeNode drink = new TreeNode("Drink");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode beer = new TreeNode("Beer");
        TreeNode wine = new TreeNode("Wine");
        drink.addChild(cold);
        drink.addChild(hot);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(beer);
        cold.addChild(wine);
        System.out.println(drink.print(0));

    }
}
