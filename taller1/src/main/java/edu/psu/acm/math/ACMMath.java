/**
 * 
 */
package edu.psu.acm.math;

import java.util.ArrayList;
import java.util.List;

import edu.psu.acm.exception.DivByZeroException;
import edu.psu.acm.exception.NullArgException;
import edu.psu.acm.exception.SizeMismatchException;

/**
 * @author ALEJA
 *
 */
public class ACMMath {
	
	 public static int add(int a, int b)
	    {
	        return a + b;
	    }

	    public static int divide(int a, int b) throws DivByZeroException
	    {
	        if (b == 0)
	        {
	            throw new DivByZeroException("Cannot divide by 0!!!!");
	        }

	        return a / b;
	    }

	    public static List<Integer> vectorAdd(List<Integer> a, List<Integer> b)
	            throws NullArgException, SizeMismatchException
	    {
	        if (a == null || b == null)
	        {
	            throw new NullArgException("Neither a nor b can be null.");
	        }
	        else if (a.size() != b.size())
	        {
	            throw new SizeMismatchException("Cannot add vectors of different sizes");
	        }

	        int aSize = a.size();
	        List<Integer> result = new ArrayList<Integer>(aSize);

	        for (int i = 0; i < aSize; i++)
	        {
	            result.add(ACMMath.add(a.get(i), b.get(i)));
	        }

	        return result;
	    }

}
