package innovative_script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait 

 {
    public static void main(String[] args) {
        int number = 1;
        call(number);
       
        System.out.println("Number still: " + number);
    }
   
    public static void call(int number) {
        System.out.println("Number in the beginning: " + number);
        number = number + 1;
        System.out.println("Number in the end: " + number);
    }
}	
		
 
