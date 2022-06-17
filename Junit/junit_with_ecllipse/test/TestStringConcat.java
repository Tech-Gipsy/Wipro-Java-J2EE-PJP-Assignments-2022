package Junit.junit_with_ecllipse.test;

import Junit.junit_with_ecllipse.DailyTasks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringConcat {
    @Test
    public void testStringConcat() {
        assertEquals("AlphaRomeo", DailyTasks.doStringConcat("Alpha", "Romeo"));
    }
}
