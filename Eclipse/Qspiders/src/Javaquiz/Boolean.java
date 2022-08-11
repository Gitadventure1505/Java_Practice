package Javaquiz;

public class Boolean 

{
    public static void main(String [] args) 
    {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if ( b1 & b2 | b2 & b3 | b2 ) /* Line 8 */
            System.out.print("ok ");
        if ( b1 & b2 | b2 & b3 | b2 | b1 ) /*Line 10*/
            System.out.println("dokey");
        boolean bool = true; 
        if(bool == false) /* Line 2 */
        {
            System.out.println("a"); 
        } 
        else if(bool) /* Line 6 */
        {
            System.out.println("b"); 
        } 
        else if(!bool) /* Line 10 */
        {
            System.out.println("c"); /* Line 12 */
        } 
        else 
        {
            System.out.println("d"); 
        }
    }
    
}