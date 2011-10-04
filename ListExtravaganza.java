import java.util.ArrayList;
import java.util.Scanner;

public class ListExtravaganza
{
   private Scanner in;
   private ArrayList<Integer> listInteger;
   private ArrayList<Double> listDouble;
   private ArrayList<Boolean> listBoolean;
   private ArrayList<String> listString;   
   
   public ListExtravaganza()
   {
   
      in = new Scanner(System.in);
      listInteger = new ArrayList<Integer>();
      listDouble = new ArrayList<Double>();
      listBoolean = new ArrayList<Boolean>();
      listString = new ArrayList<String>();   
      
     /* boolean cont = true;
      String placeHolder = "";
      
      while ((cont))
      {
         System.out.println("\nPlease enter an integer, "
                   + "boolean, double, or String:  ");
         
         if(in.hasNextInt())
         {
            add(in.nextInt());
         }
         else
         {
            placeHolder = in.next();
            
            if (placeHolder.equals("quit"))
            {
               cont = false;
            }
         }
      }//end while ((cont)) 
     */
   }//end constructor
   
   public void add (Integer inputInt)
   {
      listInteger.add(inputInt);
   }
   
   public Integer getInt(int index)
   {
      return listInteger.get(index);
   }
   
   public int sizeInt()
   {
      return listInteger.size();
   }
   
}//end ListExtravaganza