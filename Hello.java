
public class Hello 
{
	public static void main(String[] args) 
	{
		new Thread(()-> 
						{
							for(int i = 1; i <= 10; i++)
							{
								System.out.println(i);
							}
						}).
						start();
	}
}