package com.ty.string;

public class RemoveDuplicates {
 
	public static void main(String[] args) {
		String s1 = "aamaay";
		String s2 = "";
		String s3 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i+1;j < s1.length(); j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					s2=s1.replace(s1.valueOf(s1.charAt(j)), " ");
				}
			}
			
		}
		for(int i=0; i<s1.length();i++) {
			if(s2.charAt(i)!= ' ') {
				s3=s3+s2.charAt(i);
			}
				
		}
		System.out.println(s2);
	}
}
