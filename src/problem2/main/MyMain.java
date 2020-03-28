/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Traversal t = new Traversal();

        MyBinarySearchTree mst = new MyBinarySearchTree();

        TreeNode root = new TreeNode(10);

        mst.insert(root, 5);

        mst.insert(root, 1);

        mst.insert(root, 15);

        mst.insert(root, 9);

        mst.insert(root, 7);

        mst.insert(root, 12);

        mst.insert(root, 30);

        mst.insert(root, 25);

        mst.insert(root, 40);

        mst.insert(root, 45);

        mst.insert(root, 6);

        mst.insert(root, 3);
        t.printPreorder(root);

        System.out.println();

        t.printPostorder(root);
    }
}
