
interface Socialmedia
{
 void newsfeed();	
}

class Instagram implements Socialmedia
{
 public void newsfeed()
 {
	 System.out.println("love the photo");
 }
}

class Facebook implements Socialmedia
{
	public void newsfeed()
	{
		
		System.out.println("Like the photo");
	}
}

class Twitter implements Socialmedia
{
 public void newsfeed()
 {
	 System.out.println("tweet the phot");
 }
}

class Mobile
{
	static void folder(Socialmedia s)
	{
		s.newsfeed();
	}
	}
public class Mainclass6 {
	public static void main(String[] args)
	{
		Facebook f = new Facebook();
		Instagram i =  new Instagram();
		Twitter t = new Twitter();
		
		Mobile.folder(f);
		Mobile.folder(i);
		Mobile.folder(t);
	}

}
