package week2.day1;

public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test ="$$ Welcome to 2nd Class of Automation";
		int letter=0, space=0, num=0, specialchar=0;
		  char[] ch = test.toCharArray();
		  for (int i =0; i<ch.length;i++)
		  { 
			  if(Character.isLetter(ch[i])) {
				  letter++;
				 }
			  else if (Character .isDigit(ch[i]))
			  {
				  num++;
				 
			  }
			  else if (Character.isSpaceChar(ch[i]))
			  {
				  space++;
				  
			  }
			  else {
				  specialchar++;
			  }
		  }
		  System.out.println("specialCharacter:"+ specialchar);
		  System.out.println("number:" + num);
		  System.out.println("letter:"+ letter);
		  System.out.println("space:"+ space);
		  
      
	}

}

         