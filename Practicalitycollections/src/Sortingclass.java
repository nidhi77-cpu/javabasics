

import java.util.*;


public class Sortingclass {
	
	public static void main(String[] args) {
		
		 int arr[] = {7, 8, 1, 3, 2};
		 // bubble sortyy//
		 for(int i =0 ; i<arr.length-1 ; i++) {
			 for(int j=0 ; j<arr.length-i-1; j++ ) {
				 if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				 }
			 }
		 }
        System.out.println(arr);
        
        
        
        
        //   slection sort //
        
        
        int arr1[] = {7,1,4,3,2};
        
        for(int i =0 ; i<arr.length-1; i++) {
        	int smallest = i;
        	for(int j =i+1; i<arr.length ; j++) {
        		if(arr[j] < arr[smallest]) {
        			
        			smallest = j;
        			
        		}
        	}
        		int temp = arr[smallest];
        		 arr[smallest] = arr[i];

        		 arr[i] = temp;

        	
        }
        // insertion sort//
        
        for(int i =1; i<arr.length; i++) {
        	int current = arr[i];
        	int j = i-1;
        	while(j>=0 && arr[j]> current) {
        		arr[j+1] = arr[j];
        		j--;
        		
        	}
        	 arr[j+1] = current;

        }
	}

}      



//int temp = arr[j];
//arr[j] = arr[j+1];
//arr[j+1]=temp;