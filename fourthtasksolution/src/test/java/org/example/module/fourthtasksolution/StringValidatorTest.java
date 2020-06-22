package org.example.module.fourthtasksolution;

import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {
    @Test
    public void methodShouldReturnFalse() {
        Assert.assertFalse(StringValidator.stringChecking("()[Привет!])({Привет!}))"));
    }
    @Test
    public void methodShouldReturnTrue() {
        Assert.assertTrue(StringValidator.stringChecking("([{}])"));
    }
}
