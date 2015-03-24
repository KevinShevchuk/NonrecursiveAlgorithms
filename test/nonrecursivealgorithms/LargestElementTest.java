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
public class LargestElementTest 
{
    
    public LargestElementTest() 
    {
    }

    /**
     * Test of findLargestValue method, of class LargestElement.
     */
    @Test
    public void testFindLargestValue() 
    {
        System.out.println("Testing Find Largest Value");
        int[] array = {1, 4, 18, 9, 3, 17, 22, 15, 6, 3};
        LargestElement instance = new LargestElement();
        int expResult = 22;
        int result = instance.findLargestValue(array);
        assertEquals(expResult, result);
    }
}
