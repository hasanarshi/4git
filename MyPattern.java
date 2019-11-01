public class MyPattern 
{
	public static void main(String[] args) 
	{
		int n = 20, k = 1, l = 1, m = 1;

		System.out.println(0);
		for(int i = 3; i <= n; i += 2)
		{
			for(int j = 1; j <= i; j++)
			{
				if(k >= 0)
				{
					System.out.print(k--);
				}
				else
				{
					System.out.print(m++);
				}
			}
			l++;
			k = l;
			m = 1;
			System.out.println();
		}
	}
}