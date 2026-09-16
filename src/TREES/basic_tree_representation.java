package TREES;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class basic_tree_representation {
    static class node{
        int data ;
        node left;
        node right;
        public node(int key){
            data = key;
        }
    }
    public static void preorder(node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void postorder(node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }



    public static void main(String[] args) {

        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.right = new node(5);
        root.left.left = new node(4);
        root.right.left = new node(6);
        root.right.right = new node(7);
        preorder(root);

//        System.out.println("Root data : "+ root.data);
//        System.out.println("Left Child Data : "+root.left.data );
//        System.out.println("Left Child Left data :"+ root.left.left.data);
//        System.out.println("Left  Child Right data :"+ root.left.right.data);
//
//        System.out.println("Right Child data : "+ root.right.data);
//
//        System.out.println("Right Child Left data :"+ root.right.left.data);
//        System.out.println("Right Child Right data :"+ root.right.right.data);



    }
}
