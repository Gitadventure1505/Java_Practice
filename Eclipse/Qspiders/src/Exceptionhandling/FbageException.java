package Exceptionhandling;

import java.util.Scanner;

public class FbageException extends Throwable
{
	String msg;
  FbageException(String msg)
  {
	  this.msg = msg;
  }
  public String error()
  {
	  return msg;
  }
  static void age() throws FbageException
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter age");
	  int age = sc.nextInt();
	  if(age>=18)
	  {
		  System.out.println("create account");
	  }
	  else 
	  {
		  throw new FbageException("small kid");
	  }
  }
  public static void main(String[] args)
  {
	  try
	  {
		  age();
	  }
	  catch(FbageException e)
	  {
		  System.out.println(e.error());
	  }
  }
  
}
