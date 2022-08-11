class Socialmedia
{
 void newsfeed()
 { 
  System.out.println("stalk friend");
 }
}

class Facebook extends Socialmedia
{
 void newsfeed()
 {
  System.out.println("like a photo");
 }
}

class Instagram extends Socialmedia
{
 void newsfeed()
 {
  System.out.println("love the photo");
 }
}

class Twitter extends Socialmedia
{
 void newsfeed()
 {
  System.out.println("tweet the photo");
 }
}

class Mobile
{
static void folder(Socialmedia s)
{
 s.newsfeed();
}
}

class Main6
{
 public static void main(String[] args)
 {
  Facebook f = new Facebook();
  Instagram i = new Instagram();
  Twitter t = new Twitter();

  Mobile.folder(f);
  Mobile.folder(i);
  Mobile.folder(t);
 }
}