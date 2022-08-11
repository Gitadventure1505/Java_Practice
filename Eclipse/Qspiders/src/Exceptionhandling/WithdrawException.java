
package Exceptionhandling;

import java.util.Scanner;

public class WithdrawException extends Exception
{
  String msg;
  WithdrawException(String msg)
  {
	  this.msg = msg;
  }
  public String error()
  {
	  return msg;
  }
  static void withdraw() throws Exception
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("check whether withdraw or not");
	  int money = sc.nextInt();
	  if (money>=5000)
	  {
		  System.out.println("can withdraw");
	  }
	  else
	  {
		  throw new WithdrawException("insufficient balance");
	  }
  }
  public static void main(String[] args) throws Exception
  {
	  try {
		   withdraw();
	  }
	  catch(WithdrawException ae)
	  {
		  System.out.println(ae.error());
	  }
  }
	  
  
}
