package Encapsulation;

class Server
{
 private String pwd	= "jshss";
 public String getPwd()
 {
	 
	 return pwd;
 }
 public void setPwd(String newpwd)
 {
	 pwd = newpwd;
	
 }
}

public class gmailuser 
{
 public static void main(String[] args)
 {
	 Server link = new Server();
	 System.out.println(link.getPwd());
	 
	 link.setPwd("asdfgh");
	 System.out.println(link.getPwd());
 }
}
