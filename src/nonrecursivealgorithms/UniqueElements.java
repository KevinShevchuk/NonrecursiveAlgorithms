/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonrecursivealgorithms;

/**
 *
 * @author Kevin Shevchuk
 */
public class UniqueElements 
{
    public UniqueElements()
    {
        
    }
    
    /**
     * Checks whether all elements of an array are unique.
     * 
     * @param array
     * @return the first value encountered that is not unique.
     */
    int checkUniqueness(int[] array) {
        for(int i = 0; i < array.length - 2; i++)
        {
            for( int j = (i + 1);j < array.length - 1; j++)
            {
                if(array[i] == array[j])
                {
                    return array[i];
                }
            }
        }
        return -1;
    }
    
}
