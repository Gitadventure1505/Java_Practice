class A_user
{
 void message()
 {
 System.out.println("pls share this to get job");
 }
}
class Forward
{
 public static void main(String[] args)
 {
  A_user u1 = new A_user();
  B_user u2 = new B_user();
  C_user u3 = new C_user();
  u2.view(u1);
  u3.view(u1);
 }
}
class B_user
{
 void view(A_user reci)
	{
     reci.message();
 }
}
class C_user

{ 
	void view(A_user reci)

	{
		reci.message();
	}
}