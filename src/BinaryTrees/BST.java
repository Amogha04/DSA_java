package BinaryTrees;

public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public BST(){

    }

    public Node root;

    public boolean isEmpty(Node root){
        return root == null;
    }

    public void display(){
        display(this.root,"Root Node: ");
    }

    private void display(Node node, String message) {
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        display(node.left ,"Left node :" + node.left.value);
        display(node.right,"Right node :" + node.right.value);
    }

    public void insert(int value){
        insert(value,root);
    }

    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
           node.left = insert(value,node.left);
        }
        if (value > node.value){
            node.right = insert(value,node.right);
        }
        int height = Math.max(height(node.left),height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if (height(node.left.left) - height(node.left.right) > 1){
                //LL case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //LR case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if (height(node.right.left) - height(node.right.right) < 0){
                //RR case
                return leftRotate(node);
            }
            if(height(node.right.right) - height(node.right.left) < 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right)) + 1;
        c.height = Math.max(height(c.left),height(c.right)) + 1;

        return c;
    }
    private Node leftRotate(Node p){
       Node c = p.right;
       Node t = c.left;

       c.left = p;
       p.right = t;

       p.height = Math.max(height(p.left),height(p.right)) + 1;
       c.height = Math.max(height(c.left),height(c.right)) + 1;

       return c;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populate(int[] nums){
        for (int num : nums) {
            insert(num);
        }
    }

    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void sortedPopulate(int[] nums){
        sortedPopulate(nums,0,nums.length);
    }
    private void sortedPopulate(int[] nums,int start,int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;

        sortedPopulate(nums,start,mid);
        sortedPopulate(nums,mid + 1,end);
    }
}
