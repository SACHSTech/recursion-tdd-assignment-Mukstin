package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * Testing the Count7 method (First Example)
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(2, Recursion.count7(717));
    }
      /**
     * Testing the Count7 method (Second Example)
     */
     @Test
    public void Test2(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(1, Recursion.count7(7));
    }
     /**
     * Testing the Count7 method (Third Example)
     */
     @Test
    public void Test3(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals(0, Recursion.count7(123));
    }

     /**
     * Testing the Changepi method (First Example)
     */
    @Test
    public void Test4(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("x3.14x", Recursion.changePi("xpix"));
    }
      /**
     * Testing the Changepi method (Second Example)
     */
     @Test
    public void Test5(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("3.143.14", Recursion.changePi("pipi"));
    }
     /**
     * Testing the Changepi method (Third Example)
     */
     @Test
    public void Test6(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
        assertEquals("3.14p", Recursion.changePi("pip"));
    }

}
