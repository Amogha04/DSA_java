package BinaryTrees;

import java.util.Scanner;

public class BinaryTrees {
    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    public void insert(Scanner scanner){
        System.out.println("Enter the root node :");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner,root);
    }
    public void insert(Scanner scanner,Node node){
        System.out.println("Do you want to insert left node?"+ node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the left value :");
            int valueLeft = scanner.nextInt();
            root.left = new Node(valueLeft);
            insert(scanner,root.left);
        }
        System.out.println("Do you want to insert right node?"+ node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the right value :");
            int valueRight = scanner.nextInt();
            root.right = new Node(valueRight);
            insert(scanner,root.right);
        }
    }
    public void display(){
        display(this.root," ");
    }

    private void display(Node root, String space) {
        if(root == null){
            return;
        }
        System.out.println(space + root.value);
        display(root.left,space + "\t");
        display(root.right,space + "\t");
    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node root, int level) {
        if(root == null){
            return;
        }
        prettyDisplay(root.right,level + 1);
        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("----->" + root.value);
        }else {
            System.out.println(root.value);
        }
        prettyDisplay(root.left,level + 1);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}
