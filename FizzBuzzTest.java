package FizzBuzzPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzbuzz_obj;
	
	@Before
	public void setup()
	{
		fizzbuzz_obj =  new FizzBuzz(); 
	}
	@Test
	public void testNumber() {
		int number = 2;
		String result = fizzbuzz_obj.fizzbuzz_function(number);
		assertEquals("2",result);
		
	}
	@Test
	public void testGenerateFizz() {
		int number = 3;
		String result = fizzbuzz_obj.fizzbuzz_function(number);
		assertEquals("Fizz",result);
		
	}
	@Test
	public void testGenerateFizzForMultipleOf3() {
		int number = 18;
		String result = fizzbuzz_obj.fizzbuzz_function(number);
		assertEquals("Fizz",result);
		
	}
	@Test
	public void testGenerateBuzz() {
		int number = 5;
		String result = fizzbuzz_obj.fizzbuzz_function(number);
		assertEquals("Buzz",result);
		
	}
	@Test
	public void testGenerateBuzzForMultipleOf5() {
		int number = 20;
		String result = fizzbuzz_obj.fizzbuzz_function(number);
		assertEquals("Buzz",result);
		
	}
	@Test
	public void testGenerateFizzBuzz() {
		int number = 15;
		String result = fizzbuzz_obj.fizzbuzz_function(number);
		assertEquals("FizzBuzz",result);
		
	}


}
