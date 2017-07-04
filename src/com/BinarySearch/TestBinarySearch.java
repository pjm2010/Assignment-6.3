package com.BinarySearch;
/*This class will display us the result of the eleme*/
public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testResult=0;
		int shot[]={1,4,6,7,8};
		BinarySeach bs=new BinarySeach();
		testResult=bs.searchElement(shot,5,45); //Testing for element not present in the array
		
		if(testResult==0){				//If the search element is not found
			System.out.println("Sorry element not found");
		}
		else{
			System.out.println("Yeepeee we found the element using binary search "+testResult); //if the search element is found
		}
		
		
		testResult=bs.searchElement(shot,5,8); //Testing for element present in the array
		if(testResult==0){				//If the search element is not found
			System.out.println("Sorry element not found");
		}
		else{
			System.out.println("Yeepeee we found the element using binary search "+testResult); //if the search element is found
		
		
	}
 }

}
