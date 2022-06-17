package Junit.Assertmethos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class testcheckpresence {
    @Test
    public void TestCheckPresence()
    {
        assertTrue(methods.checkPresence("alex is jarvis","alex"));
        assertFalse(methods.checkPresence("Mars is far aways","earth"));
    }
}
