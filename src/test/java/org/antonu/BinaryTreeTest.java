package org.antonu;

import org.junit.Before;
import org.junit.Test;

import static org.antonu.Util.randomInt;

/**
 * Created by kit on 6/5/17.
 */
public class BinaryTreeTest {

    BinaryTree binaryTree = new BinaryTree();

    @Before
    public void setUp() {
        constantFill();
    }

    private void randomFill() {
        for (int i = 0; i < 20; i++) {
            binaryTree.addNode(randomInt(1, 100));
        }
    }

    private void constantFill() {
        binaryTree.addNode(20);
        binaryTree.addNode(14);
        binaryTree.addNode(13);
        binaryTree.addNode(22);
        binaryTree.addNode(70);
        binaryTree.addNode(44);
    }

    @Test
    public void testInOrderedTraversal() {
        System.out.println("In order traversal");
        binaryTree.inOrederedTraversal(binaryTree.getRoot());
    }

    @Test
    public void testPreOrderTraversal() throws Exception {
        System.out.println("Pre order traversal");
        binaryTree.preOrederedTraversal(binaryTree.getRoot());
    }

    @Test
    public void postPreOrderTraversal() throws Exception {
        System.out.println("Post order traversal");
        binaryTree.postOrederedTraversal(binaryTree.getRoot());
    }

    @Test
    public void dumpTree() throws Exception {
        binaryTree.dumpTree();

    }
}
