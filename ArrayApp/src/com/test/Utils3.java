package com.test;

public class Utils3 {// 13.02.2019
	public static double parseStr(String str) {
		char arr[] = str.toCharArray();
		// foreach.данный тип цыкла может быть применен к перебер.множ.
		// arr - перебираемое множество,с - каждый раз новый элемент цикла
		String doubleStr = "";
		for (char c : arr) {
			if (Character.isDigit(c)) {
				doubleStr += c;
			}
		}
		if (doubleStr.length() == 0)
			return 0.0;
		return Double.parseDouble(doubleStr);
	}

	public static String generateStr(int size) {

		String base = "1234567890qwertyuiopasdfghjklzxcvbnm";
		String randStr = "";
		for (int i = 0; i < size; i++) {
			randStr += base.charAt((int) (Math.random() * base.length()));
		}
		return randStr;
	}
	
	//ffkfkfcat213542jfjdkcat3945r8cat
	
	public static int searchSubStrings(String str,String sub){
		int pos = -1;
		int counter = 0;
		while(( pos = str.indexOf(sub)) != -1){
			counter ++;
			str = (String)str.subSequence(pos + sub.length(), str.length());
		}
		//System.out.println(str.indexOf(sub) + sub.length());
		
		return counter;
		
	}
	
	
	
	
	
	
	
	
	
}
