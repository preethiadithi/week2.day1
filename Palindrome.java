package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Madam";
		String reverse ="";
		{
			for (int i= str.length()-1; i>=0; i-- )
			{
				reverse = reverse + str.charAt(i);
				
			}
			{
				if(str.equalsIgnoreCase(reverse)) {
					System.out.println(str + "is pallindrome");
				}
				else
				{
					System.out.println(str +"is not a pallindrome");
				}
			}
		}

	}

}
