import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) { //Base case where ultiamtely if both subtrees are null, they are the same
            return true;
        }
        if (p == null || q == null || p.val != q.val) { // if one hits null and the other is still going, then false
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // the syntax here is a little weird.. i just
        // want to call the methods. suppose only root exists for eeach and is is the int '1'. calling left one both trees = true
        // and theres the problem... one subtree already returns true back to first isSameTree call without looking to see
        // if other subtree is true. need to return both together
    }
}

// HAD THE RIGHT IDEA, JUST NEED TO REALLY THINK ABOUT WHAT MY BASE CASE IS AND CATCH THAT AT THE BEGINNING OF THE METHOD
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        TreeNode tempP = p;
//        TreeNode tempQ = q;
//
//        if (tempP.left == null && tempQ.left == null) { //can't assess for null??
//            return true;
//        }
//        if (tempP.val != tempQ.val) {
//            return false;
//        }
//
//        isSameTree(tempP.left, tempQ.left);
//        isSameTree(tempP.right, tempQ.right);
//
//        return true;
//    }
//}


// i don't think i need the queue at all...putting this on pause
//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        Node currentP = p;
//        Node currentQ = q;
//        Queue<Node> queue1 = new LinkedList<>();
//        Queue<Node> queue2 = new LinkedList<>();
//
//        queue1.add(currentP); // root added
//        queue2.add(currentQ);
//
//        while (queue1.size() > 0 && queue2.size() > 0) {
//            currentP = queue1.remove(); // node removed from queue
//            currentQ = queue2.remove();
//            if (currentNode.left != null) {
//                queue.add(currentNode.left); // Node left field added to queue
//            }
//            if (currentNode.right != null) {
//                queue.add(currentNode.right); // Noode right field addd to queue
//            }
//            // repeaat the loop wheree queue will automatically remove the first item and it is assigned to currentNode
//            // etc. until queue empty such that all int fields from nodes added into the linked list
//        }
//        return results;
//    }
//
//}


////DFS not as good becaus there could in theory be hundreds of rows we need to recursivly call through to even begin
//// the first comparison. breadth firrst search better because value assessed right away
//public ArrayList<Integer> DFSInOrder(){
//        ArrayList<Integer> results=new ArrayList<>();

//class Traverse {
//    Traverse(Node currentNode) {
//        if (currentNode.left != null) {
//            new Traverse(currentNode.left);
//        }
//        results.add(currentNode.value);
//        if (currentNode.right != null) {
//            new Traverse(currentNode.right);
//        }
//    }
//}
//        new Traverse(root);
//                return results;
//                }
//                }
//
