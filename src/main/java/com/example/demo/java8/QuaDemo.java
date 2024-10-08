package com.example.demo.java8;

public class QuaDemo {

	public static void main(String[] args) {
		String str = "Java";
		String arr[] = str.split("");
		String reversedStr="";
		System.out.println(arr[3]);
		for(int i=arr.length-1; i>=0; i--) {
			reversedStr= reversedStr+ arr[i];
		}
		System.out.println("rever str:"+reversedStr);
		
//	int arr[]=	{5,2,7}; //-> [14, 35, 10] //o(n)
////	System.out.println(arr.length);
//	int b[]= new int [3];
//	
//	for(int i=0; i < arr.length; i++) {
//		int k =1;
//		for(int j=0; j< arr.length; j++) {
//			if(i != j){
//				k = arr[j]*k;
//			}
//		}
//		b[i] = k;
//	}
//	
//	for (int i : b) {
//		System.out.println(i);
//	}
		
//		int c[] = {-5,4,-6,4,-4,2,1,-8,4};
//		//3,-3,1,1
//		//i=0 -5
//		int d[] = new int[c.length];
//		int sum=0;
//		//d=
//		//j= sum of all, i&j
////		if())
//		for(int i =0; i< c.length; i++) {
//			int k=c[i];
//			for(int j= 0; j< c.length ; j++) {
//				sum = c[j] + c[j+1];
//				if( k < sum) {
//					k= sum;
//				}
//			}
////			if(k<sum) {
////				k= sum;
////			}
//		}





}

	}
	
	 


