class Car
{
 long car_price;
 String car_name;
 String car_type;
}
 car(int a, String b, String c)
 {
  car_price = a;
  car_name = b;
  car_type = c;
 }
 public static void main(String[] args)
 {
  Car c1 = new Car(500000, "Amaze","petrol");
  System.out.println("car cost ="+c1.car_price);
  System.out.println("car name = "+c1.car_name);
  System.out.println("car type =" c1.car_type);
 }