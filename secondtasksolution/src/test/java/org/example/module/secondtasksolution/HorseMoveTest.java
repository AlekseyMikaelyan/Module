package org.example.module.secondtasksolution;

import org.junit.Assert;
import org.junit.Test;

public class HorseMoveTest {

    @Test
    public void methodShouldReturnCorrectValue() {
        Assert.assertFalse(HorseMove.stepUp(20,22,22,24));
        Assert.assertTrue(HorseMove.stepUp(3,5,4,7));
    }
}
