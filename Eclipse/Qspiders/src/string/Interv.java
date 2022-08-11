package string;

public class Interv {
	
	public static String method(String sente)
	{
		String res="";
		String[] words = sente.split("\\s");
		for(String w : words)
		{   
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			res = res+sb.toString();
		}
		return res;
	}

	public static void main(String[] args) 
	{
		String str = "can i stab bats in a cave";
		System.out.println(method(str));
        
		String str2 = method(str);
	    for (int i= 0; i < str2.length(); i++) 
	    {                    
			for (int j = i+1; j < str2.length(); j++) 
			{
				if(str2.charAt(i)==str2.charAt(j))
				{
					String s1 = str2.substring(i, j+1);
					String s2 = "";
					for (int k= s1.length()-1; k>=0; k--) 
					{
						s2  =  s2+s1.charAt(k);
					}
					if(s1.equals(s2))
					{
						System.out.println(s1);
					}
				}
			}
		}
		
	}

}
