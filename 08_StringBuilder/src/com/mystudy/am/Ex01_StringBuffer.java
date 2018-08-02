package com.mystudy.am;

public class Ex01_StringBuffer {
	public static void main(String[] args) {
		//StringBuffer 클래스 
		String str = new String("Hello World!!!");
		System.out.println(str);
		
		StringBuffer sb = new StringBuffer("Hello World!!!");
		System.out.println(sb);
		System.out.println("Sb.length : " + sb.length()); 
		System.out.println("sb.capacity(): " + sb.capacity()); //StringBuffer에는 크기, 용량을 뜻하는 capacity가 존재(여유공간까지 포함)
		
		str = str +  "반갑습니다.";
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println("---------------------");
		System.out.println(str.replace("l", "L")); //method를 사용했을 때는 바뀐 데이터를 전달하지만 원본이 바뀌는건 아니다.
		System.out.println(str);
		
		System.out.println("--- StringBuffer ---");
		sb.append("반갑습니다.");
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse());
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("---- delete(), insert(), replace() ----");
		System.out.println("sb.delete : " + sb.delete(0, 6)); //처음포함, 뒤는 포함 X
		System.out.println("sb : " + sb); //StringBuffer은 원본데이터가 바뀜.
		
		System.out.println("sb.insert(0, \"Hello \") : " + sb.insert(0, "Hello "));
		System.out.println("sb : " + sb);
		
		System.out.println(sb.replace(0, 6, "Bye "));
		System.out.println("sb : " + sb);
		//replace가 제공되지 않으면 delete를 썼다가 insert로 삽입하는 방법으로 대체해도 됨
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity(): " + sb.capacity());
		
		System.out.println("----------------------------------");
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("-----------------------------------");
//		sb2.append("안녕하세요. 반갑습니다.!");
		sb2.append("안녕하세요.").append(" 반갑습니다!!");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("-- trimToSize() 실행 후 ---");
		sb2.trimToSize();
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity()); // trimToSize는 필요없는 여백공간을 없애주는 역할을 함
		
		System.out.println(">> append 실행 후");
		sb2.append(" 자바공부중~");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		System.out.println("--- setLength() 실행후 ---");
		sb2.setLength(5);
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity(): " + sb2.capacity());
		
		
		
	}

}
