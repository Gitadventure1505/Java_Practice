class Triangle82
{
 public static void main(String[] args)
 {
  int tri = new Triangle82().area();
  int tri5 = tri * 5 ;
  System.out.println("area of 5 triangle =" +tri5);

 }
 int area(){
 int b = 5;
 int h = 10;
 int ans = (b*h)/2;
 return ans;
} 
}