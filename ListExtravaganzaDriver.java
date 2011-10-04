public class ListExtravaganzaDriver
{
   public static void main (String[] args)
   {
      int testInt = 69;
      
      ListExtravaganza myList = new ListExtravaganza();
      myList.add(testInt);
      System.out.println(myList.get(0));
      
   }
}