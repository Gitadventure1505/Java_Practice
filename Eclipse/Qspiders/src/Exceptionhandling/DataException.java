package Exceptionhandling;

public class DataException extends Exception
{
	String msg;
	DataException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage() 
	{
		return msg;
	}
	static void whatsappMessage() throws DataException
    {
      String data = "off";
      if(data=="on")
      {
	   System.out.println("Message send");
      }
      else 
      {
    	  throw new DataException("Switch on the data");
      }
     }
	public static void main(String[] arr)
	{
		try 
		{
		  whatsappMessage();
		}
		catch(DataException e)
		{
			System.out.println(e.getMessage());
		}
	}
	 
}
