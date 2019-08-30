import java.util.StringTokenizer;

public class Tokenizer {
   public static int countGmail,countYahoo,countoutlook; 
   
	public static void findDomain() {
		String email[]= {"abc@yahoo.com","xyz@gmail.com","pqr@gmail.com","ccc@outlook.com","asd@yahoo.com"};
	    for(int i=0;i<email.length;i++)
	    {
	    	int x=email[i].lastIndexOf('@');
	    	if(email[i].substring(x+1).equalsIgnoreCase("gmail.com"))
	    	{
	    		countGmail++;
	    	}
	    	else if(email[i].substring(x+1).equalsIgnoreCase("outlook.com"))
	    		countoutlook++;
	    	else 
	    		countYahoo++;
	    }
	    System.out.println("No. of gmail domain is "+countGmail+"No. of outlook domain is"+countoutlook+"No. of yahoo domain is"+countYahoo);
	    System.out.println("");
}
	
	public static void removeNumber() 
	{
	  String str="ncvkjsdh768aghdah7987jzhxgc";
	  System.out.println("String is "+str);
	  System.out.println("");
	  String newstr=str.replaceAll("[0-9]","");
		System.out.println("After removing number string is "+newstr);
		System.out.println("");
	  }
	  
	public static void Token() 
	{
	  String str="1.Java,2.Oracle,3.Python,4.php";
	  StringTokenizer st=new StringTokenizer(str,"12345...,");
	  while(st.hasMoreTokens())
	  {
		System.out.println(st.nextToken());
		System.out.println("");
	  }
	}
	
	public static void palindrome() 
	{
		
		String myString = "lvkjhdfkgs7989sdjfshd";
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	    	  {
	    		  System.out.println("Given String "+myString+" is palindrome");
	    		  System.out.println("");
	    	  }
	      }else{
	         System.out.println("Given String "+myString+" is not palindrome");
	         System.out.println("");
	      }
	  	}

	public static void main(String[] args) {
		StringExamples obj=new StringExamples();
		Stringfun obj1=new Stringfun();
		Token();
	    removeNumber();
	    palindrome();
	    findDomain();
	    obj1.showCity();
	    obj.countstudents();
	    obj1.count();
	    obj.sort();
	    obj1.occurance();
	}
		}
		
