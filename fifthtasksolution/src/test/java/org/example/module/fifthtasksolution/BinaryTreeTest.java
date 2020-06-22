package org.example.module.fifthtasksolution;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void methodShouldReturnCorrectDepth() {
        Assert.assertEquals(1,BinaryTree.maxDepth(new BinaryTree(20)));
    }
}
