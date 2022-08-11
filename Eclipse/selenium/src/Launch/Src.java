package Launch;


public class Src 
{
 public static void main(String[] args)
 {
	 int vow = 0;
	 int cons = 0;
	 int dig = 0;
	 int spl = 0;
	 String s1 = "javamava688 .m333  ((7";
	 for(int i = 0; i<s1.length(); i++)
	 {
		 char ch = s1.charAt(i);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
			 vow++;
		 }
		 else if(ch>='a' && ch<='z')
		 {
			cons++; 
		 }
		 else if(ch>='0' && ch<='9')
		 {
			 dig++;
		 }
		 else
		 {
			 spl++;
		 }
		 
	 }
	 System.out.println(vow);
	 System.out.println(cons);
	 System.out.println(dig);
	 System.out.println(spl);
			
			 
			 
			 
 }
}
