public class ListExtravaganzaDriver
{
   public static void main (String[] args)
   {   
      testAddInteger(); 
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