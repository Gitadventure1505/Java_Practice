class Cloth
{
 int cloth_cost;
 String cloth_color;
 char cloth_size;
Cloth(int a, String b, char c)
{
 cloth_cost = a;
 cloth_color = b;
 cloth_size = c;
}
public static void main(String[] args)
{
 Cloth c1 = new Cloth(1000, "black", 'M');
 System.out.println("cost of cloth ="+c1.cloth_cost);
 System.out.println("size of cloth = "+c1.cloth_size);
 System.out.println("color of cloth = "+c1.cloth_color);
}
}