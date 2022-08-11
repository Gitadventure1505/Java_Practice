package Launch;

public class count_a
{
 public static void main(String[] args)
 {
	 int count_a = 0;
	 String s1 = "qasda*7((*&^$$#%^ligsfugf*((&%745uu&*ha";
	 for(int i = 0; i<s1.length(); i++)
	 {
		 char ch = s1.charAt(i);
		 if(!((ch>='a'&& ch<='z')||(ch>='0' && ch<='9')))
		 {
			 count_a++;
		 }
	 }
	 System.out.println(count_a);
 }
}
