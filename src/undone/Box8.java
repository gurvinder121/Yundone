package undone;


public class Box8 { 
	
	Static File reader r;
    public static void main(String args[])
	
	{
	
	try
	
	{
	int[]arr= {2,3,4,5,6,7,8};
	System.out.println(arr[8]);
	}
	
	catch(Exception e)
	
	{ System.out.println("catch executed"+e.getMessage());
	}
	
	
    
    
    finally
    {
    	System.out.println(arr[6]);
    	System.out.println(arr.length);
    }
    


}
}

