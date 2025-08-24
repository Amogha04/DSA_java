package BinaryTrees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTrees tree = new BinaryTrees();
//        tree.insert(scanner);
//        tree.prettyDisplay();
        BST tree = new BST();
        int[] nums = {3,4,1,2,7,8,6};
        tree.populate(nums);
        System.out.println(tree.isBalanced());
        tree.display();
    }
}
