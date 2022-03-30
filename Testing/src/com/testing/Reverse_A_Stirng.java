package com.testing;

public class Reverse_A_Stirng {

	public static void main(String[] args) {
		String s="In am Working at Nokia";
		//inbuilt method
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		//without inbuilt method
		  char[] s1=s.toCharArray(); for(int i=s.length()-1;i>=0;i--) {
		  System.out.print(s1[i]); }
		 

	}

}
