package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1 ="stops";
         String s2 ="potss";
         char[] arr1 =s1.toCharArray();
         char[] arr2 =s2.toCharArray();
         
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         boolean status =Arrays.equals(arr1,arr2);
         if(status)  {
        	 System.out.println("strings are anagram");
         }
         else {
        	 System.out.println("strings are not anagram");
        	 
         }
	}

}
