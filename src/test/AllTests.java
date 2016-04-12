package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
// THIS IS A CLASS NAMED SUITE FROM JUNIT CLASSES WITCH CONTAIN ALL MY TESTS CLASSES
@RunWith(Suite.class)
@SuiteClasses({ countATest.class, squareTest.class })
public class AllTests {

}
