/**
 * Given two sorted arrays, find their union and intersection.

Example:

Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output : Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}

Input : arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10} 
Output : Union : {2, 4, 5, 6, 8, 10} 
         Intersection : {6}
 */

import java.util.*;

class Main 
{

  static List<Integer> l1, l2, union, intersection;
  static int i, j;

  public static void test()
  {
    union = new ArrayList();
    l1 = Arrays.asList(1,3,4,5,7);
    l2 = Arrays.asList(2,3,5,6);
  }

  public static void main(String[] args) 
  {
    Main.test();

    i=0; j=0;

    while(i<l1.size() && j<l2.size())
    {
      
    }
  }
}