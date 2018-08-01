package com.mystudy.string;

public class Ex02_String2 {

	public static void main(String[] args) {
		// String 메소드들
		String st1 = "java";
		System.out.println(st1);
		System.out.println(st1.toString());
		
		System.out.println("--- indexOf() ---");
		System.out.println(st1.indexOf("a")); //없으면 (-1)값
		System.out.println(st1.indexOf('a', st1.indexOf("a")+1));
		
		System.out.println("--- isEmpty() ---");
//		st1="";
		System.out.println(st1.isEmpty());
		
		
		System.out.println("--- replace() ---");
		System.out.println("st1 : " + st1);
		System.out.println(st1.replace('a', 'b')); //원본데이터는 유지됨.
		//replace는 문자하나만
		System.out.println("st1 : " + st1);
		
		
		String st2 = "Java"; //Java라는 문자열 자체를 바꿀 수 있는건 아니다.
		st2 = "World";
		
		st1 = "java java";
		System.out.println("st1 : " + st1);
		System.out.println(st1.replaceAll("java", "JAVA"));
		System.out.println(st1.replaceFirst("va", "Ja"));
		//replaceAll은 문자열단위로 변경가능
		
		////////////////////////////////
		System.out.println("--- substring() ---");
		String str = "Java World";
		System.out.println("st1 : " + str);
		System.out.println(str.substring(5));
		//substring(beginIndex, endIndex) begin 부터, end 이전까지 
		System.out.println(str.substring(2, 5)); //2는 포함  O , 5는 포함 X
		System.out.println(str.substring(0, str.length()));
		//뒤에서 2개 문자 제외
		System.out.println(str.substring(0, str.length()-2));
		
		System.out.println("--- toCharArray() ---");
		char[] ch = str.toCharArray(); //문자열을 char[] 변환
		System.out.println(ch[0]);
		
		
		
		System.out.println("--- toUpperCase(), toLowerCase() ----");
		System.out.println("str : " + str);
		System.out.println("대문자로 toUpperCase() : "  + str.toUpperCase());
		System.out.println("소문자로 toLowerCase() : "  + str.toLowerCase());
		
		
		System.out.println("--- trim() ---"); //좌우의 공백을 지움
		String str2 = "   ab  c  D   EFG    ";
		System.out.println("str2 : " + str2);
		System.out.println("str2.trim() : -" + str2.trim() + "-");
		
		System.out.println("--- valueOf() ----");
		int num = 100;
		str2 = String.valueOf(num); //static 메소드 valueOf 사용
		System.out.println(num);
		System.out.println(num + 1);
		System.out.println(String.valueOf(num) + 1);
		
		//////////////////////////
		int num2 = Integer.parseInt("200"); // int <- String
		
		
		
		
	}

}
