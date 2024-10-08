package com.example.demo.java8.mphasis;

public class Test {

	public static void main(String[] args) {
		String s[] = {"play","pray","pond"};
		String s2[] = {"following","follow","follower"};
		String s3[] = {"ri","re","run"};
		
		printPrefix(s);
		

	}
	//cicd
	//api gate way in microservice
	//cascading
	//hibernate
	//jenkin and stages
	//diff between string buffer n builder
	//singleton key is string , can we use buffer n builder
	//serializtion asnd externalization
	//java 8 feature gc and hashmap
	//exception 2 class and methods
	//

	private static void printPrefix(String[] s) {
		
		//s[0] = string
		//for 1st
		String str = s[0]; // play
		char c[] = str.toCharArray();
		
		//
		
		
		for(int i = 0; i<c.length; i++) {
			for(int j = 1; j<s.length; j++) {
				String str2 = s[1]; //pray , pond
				char d[] = str2.toCharArray();
				for(int k = 0; k<d.length; k++) {
					char a= c[i];
					char b= d[i];
					if(a== b) {
						System.out.println("a:"+ a);
					}
				}
			}
		}
	}

}
