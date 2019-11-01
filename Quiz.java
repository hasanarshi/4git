
	public class Quiz 
	{
		public static void main(String[] args) 
		{
			String[] myArray = {"even", "odd"};
			int var = 1001;
			
			System.out.println(myArray[var % 2]);
			
			System.out.println
			(myArray[var - var / 2 * 2]);
			
			int i = 10;
			
			System.out.println(
			((i & 1) == 0) ? "even":"odd"
				);
		}
	}
