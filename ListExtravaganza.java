import java.util.ArrayList;
import java.util.Scanner;

public class ListExtravaganza
{
   private Scanner in;
   private ArrayList<Integer> listInteger;
   private ArrayList<Double> listDouble;
   private ArrayList<Boolean> listBoolean;
   private ArrayList<String> listString;   
   private int total;
   
   public ListExtravaganza()
   {
   
      in = new Scanner(System.in);
      listInteger = new ArrayList<Integer>();
      listDouble = new ArrayList<Double>();
      listBoolean = new ArrayList<Boolean>();
      listString = new ArrayList<String>();   
      
      total = 0;      
      boolean cont = true;
      String placeHolder = "";
      
      System.out.println("\nPlease enter some integers, "
            + "booleans, doubles, and/or Strings:  ");
      while ((cont))
      {         
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
            else
            {
               listString.add(placeHolder);
            }
            
         }//end else for Strings
         
         if (cont)
         {
            total++;
         }
      }//end while ((cont)) 
     
   }//end constructor
 
   /**
    * add methods
    */  
    
   public void add (Integer inputInt)
   {
      listInteger.add(inputInt);
   }
   
   public void add (String inputString)
   {
      listString.add(inputString);
   }
   
   /**
    * get methods
    */
    
   public Integer getInt(int index)
   {
      return listInteger.get(index);
   }
   
   public Double getDouble(int index)
   {
      return listDouble.get(index);
   }
   
   public Boolean getBoolean (int index)
   {
      return listBoolean.get(index);
   }
   
   public String getString (int index)
   {
      return listString.get(index);
   }

   public int getTotal()
   {
      return total;
   }

   /**
    * size methods
    */

   public int sizeInt()
   {
      return listInteger.size();
   }
   
   public int sizeDouble()
   {
      return listDouble.size();
   }
   
   public int sizeString()
   {
      return listString.size();
   }
   
   
   
}//end ListExtravaganza