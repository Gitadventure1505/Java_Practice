class Animal
{
 void noise()
 {
  System.out.println("Some noise");
 }
}

class Dog extends Animal
{
 void noise()
 {
  System.out.println("bow bow");
 }
}
 class Cat extends Animal
 {
  void noise()
  {
   System.out.println("meow meow");
  }
 }
  
  class Snake extends Animal
  {
   void noise()
   {
    System.out.println("bussss");
   }
  }
   
   class Stimulator
   {
    static void ansim(Animal a1)
    {
     a1.noise();
    }
   }

   class Mainclass
   {
     public static void main(String[] args)
     {
      Dog d1 = new Dog();
      Cat c1 = new Cat();
      Snake s1 = new Snake();

      Stimulator.ansim(d1);
      Stimulator.ansim(c1);
      Stimulator.ansim(s1);
 

     }
   }
