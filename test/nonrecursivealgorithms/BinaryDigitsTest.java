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
public class BinaryDigitsTest {
    
    public BinaryDigitsTest() {
    }

    /**
     * Test of computeBinaryDigits method, of class BinaryDigits.
     */
    @Test
    public void testComputeBinaryDigits() {
        System.out.println("Testing Compute Binary Digits");
        double number = 149;
        BinaryDigits instance = new BinaryDigits();
        int expResult = 8;
        int result = instance.computeBinaryDigits(number);
        assertEquals(expResult, result);
    }
}
