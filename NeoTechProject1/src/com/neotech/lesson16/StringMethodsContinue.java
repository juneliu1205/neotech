package com.neotech.lesson16;

public class StringMethodsContinue {
	public static void main(String[] args) {
				
				//contains();
				String sentence = "Today is July 8!";
				boolean cont = sentence.contains("today");
				//same as saying -- does the sentence contain this element (today)? Yes/no
				System.out.println(cont);
				
				//how do we check to ignore case
				System.out.println(sentence.toLowerCase().contains("today"));
				//we could do this in two lines
//				String lower = sentence.toLowerCase();
//				boolean check = lower.contains("today");​
				
				//startsWith();
				boolean starts = sentence.startsWith("Today");
				System.out.println("starts with --> " + starts);
				
				//endsWith()
				boolean ends = sentence.endsWith(" 8");
				System.out.println("ends with --> " + ends);
				
	
				
				//equals()
				String s1 = "Saturday";
				String s2 = "saturday";
				boolean equals = s1.equals(s2);
				System.out.println("equals --> " + equals);
				
				//equalsIgnoreCase()
				boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
				System.out.println("equals ignore case --> " + equalsIgnoreCase);
				
				//instead of using equalsIgnoreCase()
				
				boolean equalsLower = s1.toLowerCase().equals(s2.toLowerCase());
				System.out.println("equals lower case --> " + equalsLower);
				
				
				boolean equalsUpper = s1.toUpperCase().equals(s2.toUpperCase());
				System.out.println("equals upper case --> " + equalsUpper);
				
				
				//not with method chaining - step by step
				String s1Upper = s1.toUpperCase();
				String s2Upper = s2.toUpperCase();
				boolean compare = s1Upper.equals(s2Upper);
				System.out.println("compare --> " + compare);
				
				
			}
		}