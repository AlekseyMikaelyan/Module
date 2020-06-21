package org.example.module.fourthtasksolution;

import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {
    @Test
    public void methodShouldReturnValue() {
        Assert.assertFalse(StringValidator.stringChecking("(("));
        Assert.assertTrue(StringValidator.stringChecking("(){}[]"));
    }
}
