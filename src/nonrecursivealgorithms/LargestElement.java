/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

import java.util.ArrayList;

/**
 *
 * @author Kevin Shevchuk
 */
public class LargestElement 
{
    public LargestElement()
    {
        
    }
    
    /**
     * Finds the largest number in an array on integers.
     * 
     * @param array a randomly generated array on integers.
     * @return the largest value from the array.
     */
    public int findLargestValue(int[] array)
    {
        int maxValue = array[0];
        for( int i = 1;i < array.length - 1; i++)
        {
            if(array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}
