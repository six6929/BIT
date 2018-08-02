package com.mystudy.pm;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex05_StringControlExam01 {

	public static void main(String[] args) {
		/* ���ڿ� �ٷ��
		0.���ڿ� ������
		  String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿"
		  String str2 = "     TOM    �������� ������ �����ҹ�"
		1. ���� ���ڿ��� StringBuilder ���� sb�� �̿��ؼ� �ϳ��� ���ڿ��� �����,
		2. sb�� ���ڿ��� ��ĭ(" ")�� �����ڷ� �߶�(�̸��� ����) ȭ�� ���
		   (String.split() �Ǵ� StringTokenizer ���)
		3. ������ �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		   (��¿�: ȫ�浿,�̼���,�̼���,Tom,ȫ�浿,TOM,��������,������,�����ҹ�)
		4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		   (��: ȫ,��,��,T,ȫ,T,��,��,��) 
		5. �迭�� ���ڿ��� �̸��� ���ڼ��� 4 �̻��� ���� "�ε�����ȣ:�̸�" ���
		       ��¿�: 
		   6:��������
		   8:�����ҹ�
		********************************/
		String str1 = "ȫ�浿 �̼���   �̼��� Tom ȫ�浿";
		String str2 = "     TOM    �������� ������ �����ҹ�";
		//"ȫ�浿 �̼���   �̼��� Tom ȫ�浿 	TOM		�������� ������ ����ҹ�"
		
		//1��.
		StringBuilder sb = new StringBuilder(); //��ü ����
		sb.append(str1).append(str2);
		System.out.println(sb);
		
		//2. sb�� ���ڿ��� ��ĭ(" ")�� �����ڷ� �߶�(�̸��� ����) ȭ�� ���
		//   (String.split() �Ǵ� StringTokenizer ���)
		StringTokenizer stk = new StringTokenizer(sb.toString()," ");
		
		//�߶� �����͸� �迭�� ����
		int tokenCnt = stk.countTokens();
		String[] names = new String[stk.countTokens()];
		
		//names <- stk ���� ����
		for(int i=0; i<tokenCnt; i++) {
			names[i] = stk.nextToken();
		}
		
		System.out.println(Arrays.toString(names));
		
		for(String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		//3. ������ �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		//   (��¿�: ȫ�浿,�̼���,�̼���,Tom,ȫ�浿,TOM,��������,������,�����ҹ�)
		StringBuilder sbResult = new StringBuilder();
		sbResult.append(names[0]);
		for (int i=1; i<names.length; i++) {
			sbResult.append(",").append(names[i]);
			//�������϶��� �̸��� ���̱�
		}
		System.out.println(sbResult.toString());
		
		
		//4. �������� ù���ڸ� �����ؼ� �޸�(,)�� �����Ͽ� �Ѷ��ο� ���(StringBuilder ���)
		//   (��: ȫ,��,��,T,ȫ,T,��,��,��)

		//substring() -> ���ڿ��� ���� , charAt() -> �� ���ڸ� ����
		
		sbResult.setLength(0);
		boolean isFirst = true;
		
		for (String name : names) {
			if (isFirst) {
				sbResult.append(name.charAt(0));
				isFirst = false;
			} else  {
				sbResult.append(",").append(name.charAt(0));
			}
		}
		System.out.println(sbResult.toString());
		
		
		//5. �迭�� ���ڿ��� �̸��� ���ڼ��� 4 �̻��� ���� "�ε�����ȣ:�̸�" ���
		//		��¿�: 
		//		6:��������
		//		8:�����ҹ�
		sbResult.setLength(0);
		int idx = 0;
		for (String str : names) {
			if(str.length() >= 4) {
				sbResult.append(idx + " : " + str + "\n");
			}
			idx++;
		}
		System.out.println(sbResult.toString());
	}

}
