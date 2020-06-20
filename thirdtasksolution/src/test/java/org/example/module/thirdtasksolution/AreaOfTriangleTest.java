package org.example.module.thirdtasksolution;

import org.junit.Assert;
import org.junit.Test;

import java.security.spec.ECParameterSpec;

public class AreaOfTriangleTest {
    private final double accuracy = 1e-9;
    @Test
    public void methodShouldReturnZero() {
        Assert.assertEquals(0.0, AreaOfTriangle.areaCalculation(1.0,0.0,1.0,0.0,1.0,0.0), accuracy);
    }

    @Test
    public void methodShouldReturnCorrectLength() {
        Assert.assertEquals(0.0, AreaOfTriangle.lengthBetweenTwoPoints(1.0,1.0,1.0,1.0), accuracy);
    }
}
