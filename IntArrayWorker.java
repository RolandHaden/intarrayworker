/*
Author: Davis Haden
Date: 12-11-2020
Desc: A program showing the different functions of an array and the different ways it can be used.
 */
public class IntArrayWorker
{
  // the integer array
  private int[] numArray;
  
  /**
   * A constructor that takes the integer array
   * @param theArray the integer array to use
   */
  public IntArrayWorker(int[] theArray)
  {
    numArray = theArray;
  }
  
   /**
   * Method to set the number array
   * @param theArray the new array to use
   */
  public void setNumArray(int[] theArray)
  {
    numArray = theArray;
  }
  
  
  /**
   * @return the elements of the array as a string
   */
  public String toString()
  {
    String result = "";
    int num = 0;
    for (int i = 0; i < numArray.length - 1; i++)
    {
      num = numArray[i];
      result = result + String.valueOf(num) + ", ";
    }
    return result + numArray[numArray.length-1];
  }
  
  /** 
   * Method to find and return the smallest value in the array
   * @return the smallest value in the array
   */
  public int getSmallest()
  {
    int smallest = Integer.MAX_VALUE;
    for (int num = 0; num < numArray.length; num++)    
    {
      if (numArray[num] < smallest)
      {
        smallest = numArray[num];
      }
    }
    return smallest;
  }
  
  /** 
   * Method to find and return the largest value in the array
   * @return the largest value in the array
   */
  public int getLargest()
    {
      int largest = Integer.MIN_VALUE;
      for (int num = 0; num < numArray.length; num++)    
      {
         if (numArray[num] > largest)
      {
         largest = numArray[num];
      }
    }
    return largest;
    }
  
  /** get average
    * @return the average of the items in the array
    * precondition: there is at least one item in the array
    */
    public double getAverage()
    {
      double average = 0;
      for(int times = 0; times < numArray.length; times++){
         average = average + numArray[times];
      }
      average = average / numArray.length;
    return average;
    }
  
  
  /**
   * Method to return a new array containing every other element
   * from the original array
   * @return a new array with every other element from numArray
   */
    public int[] getEveryOther()
       //notice what type needs to be returned!
    {
      int lengthSet = 0;
      for(int times = 0; times < numArray.length; times = times + 2){
         lengthSet = lengthSet + 1;
         //System.out.println(lengthSet);
      }
      int[] newArray = new int[lengthSet];
      int loop = 0;
      int loopSecond = 0;
      while(loop <= newArray.length-1){
         if(loopSecond <= numArray.length-1){
         newArray[loop] = numArray[loopSecond];
         }
         loop++;
         loopSecond = loopSecond + 2;
      }
      //fixing zeros
      return newArray;
    }
    
    
  /**
   * Method to reverse the array elments
   */
  public void reverse()
  {
   int i = 0;
   int j =  numArray.length-1;
   int temp;
   while(i < j){
      temp = numArray[i];
      numArray[i] = numArray[j];
      numArray[j] = temp;
      i++;
      j--;
   }
     }
  

  /**
   * Method to find the index of a value in the array
   * @return the index of the value in the array
   * or -1 if not found
   */
  public int getIndex(int value)
  {
   boolean check = false;
   int index;
   int times = 0;
   while(check == false && times < numArray.length){
      if(value == numArray[times]){
         check = true;
      }
      times++;
   }
   if(check == true){
      return times - 1;
   }else{
   return -1;
   }
  }
  

  
  public static void main(String[] args)
  {
    int[] t1 = {1, 2, 3, 4, 5};
    IntArrayWorker arrayWorker = new IntArrayWorker(t1);
    int value = arrayWorker.getSmallest();
    System.out.println("Expected 1 from getSmallest and got " + value); 
    
    
    int [] t2 = {6, 4, 2, 3};
    arrayWorker.setNumArray(t2);
    value = arrayWorker.getSmallest();
    System.out.println("Expected 2 from getSmallest and got " + value);
    value = arrayWorker.getLargest();
    System.out.println("Expected 6 from getLargest and got " + value);
    
    
    
    double dValue = arrayWorker.getAverage();
    System.out.println("Expected 3.75 from getAverage and got " + dValue);
    
    
    
    int[] newArray = arrayWorker.getEveryOther();
    arrayWorker.setNumArray(newArray);
    System.out.println("Expected 6,2 from getEveryOther and got " + arrayWorker);
    arrayWorker.setNumArray(t1);
    newArray = arrayWorker.getEveryOther();
    arrayWorker.setNumArray(newArray);
    System.out.println("Expected 1,3,5 from getEveryOther and got " + arrayWorker);
    
    
    
    int[] t3 = {9,-3,5,7,-2};
    arrayWorker.setNumArray(t3);
    int index = arrayWorker.getIndex(-2);
    System.out.println("expected 4 from getIndex got " + index);
    index = arrayWorker.getIndex(8);
    System.out.println("expected -1 from getIndex got " + index);
    
    
    
    int[] t4 = {1, 3, 5, 8, 10};
    arrayWorker.setNumArray(t4);
    index = arrayWorker.getIndex(9);
    System.out.println("Expected -1 from getIndex and got " + index);
    index = arrayWorker.getIndex(3);
    System.out.println("Expected 1 from getIndex and got " + index);
    index = arrayWorker.getIndex(10);
    System.out.println("Expected 4 from getIndex and got " + index);
    index = arrayWorker.getIndex(1);
    System.out.println("Expected 0 from getIndex and got " + index);
    
    
    
    arrayWorker.reverse();
    System.out.println("Expected 10,8,5,3,1 from reverse got " + arrayWorker);
    
    
    
  }
}
 