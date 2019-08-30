import java.util.Scanner;
import java.util.Arrays;
public class Stringfun {

	public void showCity()
	{
		String city= "Indore,Bhopal,Ujjain,Mumbai";
		String c="";int i;
	    System.out.println("List of City is "+city);
	    for(i=0;i<city.length();i++)
	   {
	   
	      if(city.charAt(i)!=',') 	
	      c=c+ city.charAt(i);
	      else 
	      {	System.out.println(c);
	        c="";
	   }
	   }
	    System.out.print(c);
	   
	}
	public void occurance() 
	{
	 String s="this is java java is a programming language java is object oriented and powerful.I love java language";
	 String a[] = s.split(" "); 
	 String word="java";
	    int count = 0; 
	    for (int i = 0; i < a.length; i++)  
	    { 
	    if (word.equals(a[i])) 
	        count++; 
	    } 
	  
	    System.out.println("Java occures"+count);		
		
	}
	
	public void count(){
		System.out.println("Enter a sequence to count the characters");
		Scanner sc=new Scanner(System.in); 
		String Sequence= sc.next();
		char[] ch = Sequence.toCharArray();
		int letter = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < Sequence.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("Given string is :"+Sequence);
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("other symbol: " + other);
		sc.close();
	}
}
