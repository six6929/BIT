package com.mystudy.pm01_generic;

class Box {
	Object obj;

	Object getObj() {
		return obj;
	}

	void setObj(Object obj) {
		this.obj = obj;
	}
	
}
//���ʸ� ���� �ڽ�
class BoxG<T> {
	private T obj;
	
	T getObj() {
		return obj;
	}

	void setObj(T obj) {
		this.obj = obj;
	}
	
}
public class GenericExam {

	public static void main(String[] args) {
		//���ʸ�(Generic) : �÷����� � ��ü��� �̷��������  ǥ���ϴ� ��üŸ���� �ǹ�
		//���ʸ� ���� : <��ü�ڷ���>, <>
		//API => <T> : ��ü�ڷ���, <E> : �ϳ��� ���(��, ��ü�ϳ�)
		//       Map���� : <K, V> K - key, V - value
		//Set<E>, List<E>, Queue<E>, Map<K,V>
		
		Box box = new Box();
		box.setObj(100);
		box.setObj("���ڿ�String");
		box.getObj();
		String str = (String)box.getObj();
		System.out.println(str.substring(0, 3));
		
		box.setObj(new Box());
		
		//-----------------------------------------
		String str1 = "10000";
		String str2 = "Hello Java";
		int str3 = 3333;
		
		System.out.println("---- ���ʸ� ���� ----");
		BoxG<String> boxg = new BoxG<String>();
		boxg.setObj("���ڿ�String");
		boxg.setObj(str1);
		boxg.setObj(str2);
//		boxg.setObj(str3); //������ �ܰ迡�� Ÿ��üũ�� Ȯ�� ����
		
		System.out.println(boxg.getObj());
		
		//------------------------------
		BoxG<Integer> boxg2 = new BoxG<>(); //<> ���̾Ƹ�� ������ ó�� ����
		boxg2.setObj(99999);
//		boxg2.setObj("���ڿ��� �ȵ�");
		System.out.println(boxg2.getObj());
	
	}

}
