import java.util.ArrayList;

public class ListExtravaganza
{
   private ArrayList<Integer> listInteger;
   private ArrayList<Double> listDouble;
   private ArrayList<Boolean> listBoolean;
   private ArrayList<String> listString;   
   
   public ListExtravaganza()
   {

      listInteger = new ArrayList<Integer>();
      listDouble = new ArrayList<Double>();
      listBoolean = new ArrayList<Boolean>();
      listString = new ArrayList<String>();   
      
   }
   
   public void add (Integer inputInt)
   {
      listInteger.add(inputInt);
   }
   
   public Integer getInt(int index)
   {
      return -6;
      //return listInteger.get(index);
   }
}