package com.BinarySearch;
/*This class will define the logic for searching an element thrrough binary search*/
public class BinarySeach {

	
	
	public int searchElement(int [] arr,int n,int y){
	
		int start=0;
		int end=n-1;
		int mid=0;
		int result=0;
		
		while(start<=end){
			mid=(start+end)/2;
			
			if(arr[mid]==y){
				return result=arr[mid]; //This is place where the search element is found
			}
			else if(arr[mid]<y){
			start=mid+1;
			}
			else {
			end=mid-1;
		
			}
			
		}
		return result ;

	}
	
}