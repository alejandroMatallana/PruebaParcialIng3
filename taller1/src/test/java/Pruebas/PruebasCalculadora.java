package Pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import edu.psu.acm.exception.DivByZeroException;
import edu.psu.acm.exception.NullArgException;
import edu.psu.acm.exception.SizeMismatchException;
import edu.psu.acm.math.ACMMath;

public class PruebasCalculadora {

	@Test
	public void PruebaSumaNumerosPostivo() {
		assertEquals(4, ACMMath.add(2, 2));
	}

	@Test
	public void PruebaSumaNumerosNegativo() {
		assertEquals(-4, ACMMath.add(-2, -2));
	}

	@Test
	public void PruebaSumaNumeroPositivoNumeroNegativo() {
		assertEquals(3, ACMMath.add(-2, 5));
	}

	@Test
	public void PruebaDivision() throws DivByZeroException {
		assertEquals(2, ACMMath.divide(4, 2));
	}

	@Test
	public void PruebaDivisionNegativo() throws DivByZeroException {
		assertEquals(-2, ACMMath.divide(4, -2));
	}
	
	@Test
	public void PruebaDivisionNumerosNegativos() throws DivByZeroException {
		assertEquals(2, ACMMath.divide(-4, -2));
	}

	@Test(expected = DivByZeroException.class)
	public void PruebaDivisionCero() throws DivByZeroException {
		ACMMath.divide(4, 0);
	}

	@Test(expected = NullArgException.class)
	public void PruebaVectorSegundoNull() throws NullArgException, SizeMismatchException {
		ACMMath.vectorAdd(new ArrayList<Integer>(), null);
	}

	@Test(expected = NullArgException.class)
	public void PruebaVectorPrimerNull() throws NullArgException, SizeMismatchException {
		ACMMath.vectorAdd(null, new ArrayList<Integer>());
	}
	
	@Test(expected = SizeMismatchException.class)
	public void PruebaVectorDifferentSize() throws NullArgException, SizeMismatchException {
		ACMMath.vectorAdd(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
				new ArrayList<Integer>(Arrays.asList(1, 2)));
	}

	@Test
	public void PruebaVector() throws NullArgException, SizeMismatchException {
		assertArrayEquals(new Object[] { 4, 6 }, (Object[]) ACMMath
				.vectorAdd(new ArrayList<Integer>(Arrays.asList(1, 2)), new ArrayList<Integer>(Arrays.asList(3, 4)))
				.toArray());
	}
}
