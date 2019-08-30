import java.util.Arrays;

public class StringExamples {
	public static int countCS;
	public static int countIT;
	public static int countCivil;
	public static int countMech;

	public void countstudents() {
		 String rollno[]= {"126566","127665","342978","340897","564839","784738"};
		 for(int i=0;i<rollno.length;i++)
		 {
			 if(rollno[i].startsWith("12"))
				 countCS++;
			 else if(rollno[i].startsWith("34"))
				 countIT++;
			 else if(rollno[i].startsWith("56"))
				 countMech++;
			 else if(rollno[i].startsWith("78"))
				 countCivil++;
		 }
		 System.out.println("");
		 System.out.println("No of CS Students  "+countCS+" No. of IT students  "+countIT);
		 System.out.println("");
		 System.out.println("No. of Mechanical students  "+countMech+" No. of Civil Students  "+countCivil);
		 System.out.println("");	
	}
	
	public void sort() {
		String temp=null;
		String arr[]= {"Banana","Orange","Mango","Apple"};
		System.out.println("Array before sorting is"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) 
		{
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if( arr[i].compareTo(arr[j]) > 0 ) 
		        {
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		System.out.println("Sorted Array is= " + Arrays.toString(arr));
	}

	}
