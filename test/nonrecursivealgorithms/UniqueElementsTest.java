/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Shevchuk
 */
public class UniqueElementsTest {
    
    public UniqueElementsTest() {
    }
    
    /**
     * Test of checkUniqueness method, of class UniqueElements.
     */
    @Test
    public void testCheckWithUniqueNumbers() {
        System.out.println("Testing Uniqueness with a unique array.");
        int[] array = {2, 7, 18, 6, 3, 22, 17, 14, 10, 25};
        UniqueElements instance = new UniqueElements();
        int expResult = -1;
        int result = instance.checkUniqueness(array);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckWithoutUniqueNumbers() {
        System.out.println("Testing Uniqueness with a non-unique array.");
        int[] array = {2, 7, 18, 6, 3, 22, 17, 14, 6, 25};
        UniqueElements instance = new UniqueElements();
        int expResult = 6;
        int result = instance.checkUniqueness(array);
        assertEquals(expResult, result);
    }
    
}
