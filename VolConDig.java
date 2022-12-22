package com.Stringprob;

import java.util.Scanner;

public class VolConDig {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter the string :");
		//String ch = sc.next();
		String ch = "geeks for geeks";
		String[] ch2 = ch.split("\\s");
		int Vcount = 0, Ccount = 0;
		for (int i = 0; i < ch2.length; i++) {
			//char ch1 = ch.charAt(i);
			//System.out.println("ch[i] :" + ch1);
			System.out.println("ch[i] :"+ch2[i]);
			System.out.println("ch[i] :"+ch2[i].length());
			
		}
		for(String w:ch2) {
			System.out.println("split methdo :"+w);
		}

		for (int i = 0; i < ch.length(); i++) {
			char ch1 = ch.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u') {
				Vcount++;
			} else {
				Ccount++;
			}
		}
		System.out.println("Vcount :" + Vcount);
		System.out.println("Ccount :" + Ccount);

	}

}
