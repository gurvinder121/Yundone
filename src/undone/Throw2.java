package undone;


public class Throw2 {
	
	
		
		static void valid(int i) {
			if (i < 18) 
			{
				throw new ArithmeticException("not valid");
				
			} 
			
			else 
				
			{
				System.out.println("welcome ji soneo");

			}
		}
			public static void main(String args[])
			
			{
				try
				{
					valid(20);
				}
				
				catch(ArithmeticException e)
				
				{
					System.out.println(e);
					
				}
				System.out.println("welcome");
				
			}
		

		}



