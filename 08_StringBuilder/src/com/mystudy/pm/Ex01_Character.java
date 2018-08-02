package com.mystudy.pm;

public class Ex01_Character {

	public static void main(String[] args) {
		// Wrapper class : Character
		char chr = 'a';
		System.out.println(Character.isAlphabetic(chr)); //true
		System.out.println(Character.isAlphabetic('한')); //true
		System.out.println(Character.isAlphabetic('0')); //false
		System.out.println(Character.isLetter('0')); //false
		System.out.println(Character.isLetter('A')); //true
		System.out.println(Character.isUpperCase('A')); //true
		System.out.println(Character.isLowerCase('a')); //true
		System.out.println(Character.isWhitespace(' ')); //true 
		System.out.println(Character.isWhitespace('A')); //false
		System.out.println(Character.isDigit('0')); //true //isDigit 숫자인지?
		//whitespace -> 화면상에 보이지 않는 것들을 의미
		
		//-----------------------------------------
		char[] chs = {'한', 'a', ' ', 'A', '+', '0'};
		for(int i=0; i<chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if(Character.isDigit(chs[i])) {
				System.out.print("숫자");
			}
			if(Character.isWhitespace(chs[i])) {
				System.out.print(" 공백");
			}
			if(Character.isUpperCase(chs[i])) {
				System.out.print(" 대");
			}
			if(Character.isLowerCase(chs[i])) {
				System.out.print(" 대");
			}
			if(Character.isLetter(chs[i])) {
				System.out.print(" 문자");
			}
			if(Character.isDefined(chs[i])) {
				System.out.print(" 유니코드입니다.");
			}
			System.out.println();
		}
	}

}
