package Junit.Assertmethos;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class testsort {
    @Test
    public void  TestSort()
    {
        int[] unsorted={5,3,4,2,1};
        int[] a={1,2,3,4,5};
        assertArrayEquals(a,methods.sortValue(unsorted));
    }
}
