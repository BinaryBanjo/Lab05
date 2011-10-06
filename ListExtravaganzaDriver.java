public class ListExtravaganzaDriver
{
   public static void main (String[] args)
   {   
      //testAddInteger();
      testConstructor(); 
   }
   
   public static void testConstructor()
   {
      ListExtravaganza myList = new ListExtravaganza();
      int total = myList.sizeInt() /** + myList.sizeDouble()
                + myList.sizeBoolean()*/ + myList.sizeString();
      
      /**
       * Test to see if created arrays whose total values 
       * are equal to the total entered
       */
      
      if (total == myList.getTotal())
      {
      }
      else
      {
         System.out.println("Error in testConstructor: "
         + "\nExpected: " + total + "\nReceived: " + myList.getTotal());
         
      }
       
      

      /**
       * Tests to see if constructor made an empty ArrayList<Double>
       */

      if (myList.sizeDouble() == 0)
      {
      }
      else
      {
         System.out.println("Error in testConstructor Double: "
               + "\nExpected: " + 0 + "\nReceived: " + myList.sizeDouble());
      }
      
      
   }
   public static void testAddInteger()
   {
      ListExtravaganza myList = new ListExtravaganza();
      int intOne = 6;
      int intTwo = 9;
       
      myList.add(intOne);
      myList.add(intTwo);
       
      if (myList.getInt(0) == intOne)
      {}
      else
      {
        System.out.println("Error in testAddInteger:"
              + "\nExpected: " + intOne + "\nReceived: " + myList.getInt(0));
      }
       
      if (myList.getInt(1) == intTwo)
      {}
      else
      {
        System.out.println("Error in testAddInteger:"
              + "\nExpected: " + intTwo + "\nReceived: " + myList.getInt(1)); 
      }
   }//end testAddInteger
}//ListExtravaganzaDriver