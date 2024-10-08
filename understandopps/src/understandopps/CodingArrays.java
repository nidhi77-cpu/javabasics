package understandopps;

import java.util.logging.Logger;

public class CodingArrays {
	
	

	public static void main(String[] args) {
	// program to differnate the lowest of any array	
//	  int a[] = {8,3,7,15};
//	  int b[] = {5,6,4,20};
//	  int[] c= new int[4];
//	  
//	  try {
//		for(int i=0; i<a.length;i++)
//		  {
//			 if((a[i]>b[i])|| (a[i]<b[i]))
//			  {
//				  c[i]= a[i];
//			  }
//		  System.out.println(c[i]);
//		  }
//		
//	} catch (Exception e) {
//	   System.out.println("not able to get the array");
//	}
		//2. sorting of any array program
		int a[] = {8,3,7,15};
		
        int temp=0 ;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]<a[j])
				{
			
				temp =a[i];
				a[i]= a[j];
				a[j]= temp;
				
			}
			}
			System.out.println();
		}
		for(int i=0; i<a.length;i++)
		{
			System.out.println("the elements are sorted in correct way" + a[i]);
		}
		

	}

}
