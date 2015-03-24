/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

import static java.lang.Math.floor;

/**
 *
 * @author Kevin Shevchuk
 */
public class BinaryDigits 
{
    public BinaryDigits()
    {
        
    }
    
    
    /**
     * computes the number of digits in a numbers binary representation
     * 
     * @param number
     * @return count
     */
    public int computeBinaryDigits(double number)
    {
        int count = 1;
        while (number > 1)
        {
            count++;
            number = floor(number/2);
        }
        return count;
    }
}
