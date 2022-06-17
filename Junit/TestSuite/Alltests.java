// Create a test suite for all the 3 classes created under the com.wipro.test package  and execute the same
package Junit.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({testcheckpresence.class,testsort.class,TestStringConcat.class})
public class Alltests {
}
