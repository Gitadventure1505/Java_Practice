package Abstraction;


 interface Shoe
 {
	 void nike();
 }
 
 interface Bags extends Shoe
 {
	 void puma();
 }
 
 abstract class RajOutlet implements Bags
 {
	 public void nike()
	 {
		 System.out.println(123);
	 }
 }
 
 class Rajaji extends RajOutlet
 {
	 public void puma()
	 {
		 System.out.println(456);
	 }
	
	 
	 public static void main(String[] args)
	 {
		 Rajaji Raj = new Rajaji();
		 Raj.puma();
		 Raj.nike();
	 }
	
 }
 
 
 

