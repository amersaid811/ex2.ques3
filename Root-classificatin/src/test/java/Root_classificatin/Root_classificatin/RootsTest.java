package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
	//test
	@Test
	public void testPartion1() 
	{
		//(0,1,2)
		Roots.calculate_roots(-2, 1, 2);
		
		String  root_expected = Root_Types.EROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion2() 
	{
		//(0,1,2)
		Roots.calculate_roots(25, 50, 25);
		 
		String  root_expected = Root_Types.Equal_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion99() 
	{
		//(0,1,2)
		Roots.calculate_roots(99, 2, 1);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion4()
	{
		//(0,1,2)
		Roots.calculate_roots(1, 5, 6);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartion5()
	{
		//(0,1,2)
		Roots.calculate_roots(0, 0, 0);
		
		String  root_expected = Root_Types.	Not_quadratic.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	}
