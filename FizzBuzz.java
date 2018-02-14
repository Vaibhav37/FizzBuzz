package FizzBuzzPackage;

public class FizzBuzz {
	public String fizzbuzz_function(int number)
	{
		if(number %3 ==0)
		{
			if(number %5==0)
				return "FizzBuzz";
			return "Fizz";	
		}
		if(number%5==0)
			return "Buzz";
		return Integer.toString(number);
	}

}