package Innovative;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Leap {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		
		int number  = sc.nextInt();
		boolean leap= false;
		if(number%4==0)
		{
			if(number%100==0) 
			{
				if(number%400==0)
				{
					//System.out.println(number+" is a leap year");
					leap = true;
					
				}
				else
				{
					//System.out.println(number+" is not a leap year");
				    leap = false;	
				}
			}
			else
			{
				//System.out.println(number +" is a leap year");
				leap = true;
			}
		}
		else 
		{
			//System.out.println(number+" is not a leap year");
		    leap = false;
		}
		int year = number;
		number=number-1;//hence we have to find upto previous year
		int odd = 0;
        number = number%400;
        if(number>=300)
        {
            number = number%300;
        	odd = 1; 
        }
        if (number>=200 && number<=299)
        {
        	number = number%200;
        	odd = 3;
        }
        if(number>=100 && number<=199)
        {
        	number = number%100;
        	odd = 5;
        }
        int leap_years  =number/4;
        int no_leap_years = number-leap_years;
       //System.out.println(no_leap_years);
       // System.out.println(leap_years);
        int odd_years= odd+leap_years*2+no_leap_years*1;
       // System.out.println(odd_years);
        
        
        
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("jan", 0);
        map.put("feb", 3);
        if(leap==true)
        map.put("mar", map.get("feb")+1);
        else
        map.put("mar", map.get("feb")+0);
        map.put("apr", map.get("mar")+3);
        map.put("may", map.get("apr")+2);
        map.put("jun", map.get("may")+3);
        map.put("jul", map.get("jun")+2);
        map.put("aug", map.get("jul")+3);
        map.put("sep", map.get("aug")+3);
        map.put("oct", map.get("sep")+2);
        map.put("nov", map.get("oct")+3);
        map.put("dec", map.get("nov")+2);
        //System.out.println(map);
        
        
        System.out.println("Enter the Month");
        String mon = sc.next();
         int odd_month = map.get(mon);
        // System.out.println(map.get(mon));
         
         System.out.println("Enter the date");
         number = sc.nextInt();
         number = number%7;
        // System.out.println(number);
         int fin = number+odd_month+odd_years;
         int finalize = fin%7;
         
         
         Map<Integer, String> mappy = new LinkedHashMap<>();
         mappy.put(1,"Monday");
         mappy.put(2,"Tuesday");
         mappy.put(3,"Wednesday");
         mappy.put(4,"Thursday");
         mappy.put(5,"Friday");
         mappy.put(6,"Saturday");
         mappy.put(0,"Sunday");
         
         
         System.out.println("the day is "+mappy.get(finalize));
        
        

   
        
	}
	
	

}
