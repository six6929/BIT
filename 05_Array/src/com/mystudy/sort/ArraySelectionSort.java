package com.mystudy.sort;

public class ArraySelectionSort {

	public static void main(String[] args) {
		//�迭�� ����� ���� ����(�������� : ASC)
		//30, 20, 50, 40, 10
		int[] num = {30, 20, 50, 40, 10};
		
		//������ Ȯ��
//		for(int i=0; i<num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
		printData(num);
		
		System.out.println("--- ���Ľ��� ---");
		//ù��° �� �������� �� �۾�(0�ε��� - 1�ε���)
		int temp;
/*
		if(num[0] > num[1]) {
			temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		} 
		printData(num);
		//ù��° �� �������� �� �۾�(0�ε��� - 2�ε���)
		if(num[0] > num[2]) {
			temp = num[0];
			num[0] = num[2];
			num[2] = temp;
		} 
		printData(num);
		//ù��° �� �������� �� �۾�(0�ε��� - 3�ε���)
		if(num[0] > num[3]) {
			temp = num[0];
			num[0] = num[3];
			num[3] = temp;
		} 
		printData(num);
		//ù��° �� �������� �� �۾�(0�ε��� - 4�ε���)
		if(num[0] > num[4]) { //�ε��� : num.length-1
			temp = num[0];
			num[0] = num[4];
			num[4] = temp;
		} 
		printData(num);
		
		//�ݺ������� ����ó��
		//ù��° ���� �������� ����(�ε��� : 0�� ����)
		for(int i=1; i<=4; i++) {
			if(num[0] > num[i]) {
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);
		
		//�ι�° ���� �������� ����(�ε��� : 1�� ����)
		for(int i=2; i<=4; i++) {
			if(num[1] > num[i]) {
				temp = num[1];
				num[1] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);
		
		//����° ���� �������� ����(�ε��� : 2�� ����)
		for(int i=3; i<=4; i++) {
			if(num[2] > num[i]) {
				temp = num[2];
				num[2] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);

		//�׹�° ���� �������� ����(�ε��� : 3�� ����)
		for(int i=4; i<=4; i++) {
			if(num[3] > num[i]) {
				temp = num[3];
				num[3] = num[i];
				num[i] = temp;
			} 
		}
		printData(num);
*/		
/*		
		//�ݺ��� ó��
		System.out.println("--- ���� for������ ó�� ---");
		int baseIdx = 0;
		for(int dest=1; dest<=4; dest++) {
			for(int i=dest; i<=4; i++) {
				if(num[baseIdx] > num[i]) {
					temp = num[baseIdx];
					num[baseIdx] = num[i];
					num[i] = temp;
				} 
			}
			baseIdx++;
		}
		printData(num);
*/		
/*		
		//�ٱ��� ���� for���� ����(0�ε���)���� �������ε��� ������
		int lastValue = num.length-1;
		for(int gijun=0; gijun < lastValue; gijun++) {
			//for���� ������ �����ε��� + 1 ������ �����ϰ� �������ε�������
			for (int i=gijun+1; i<num.length; i++) {
				if(num[gijun] > num[i]) { // ���������Ϸ��� ��ȣ�� �ٲٸ� ��.
					temp = num[gijun];
					num[gijun] = num[i];
					num[i] = temp;
				} 
			}
		}
		printData(num);
*/	
		////////////////////////////////////////////////////
		//�� ���� ��ġ���� Ȯ���ϰ� �������� ��ȯ �ѹ��� ����
		
		printData(num);
		
		System.out.println("--- ���� ���� ---");
		int lastValue = num.length-1;
		int changeIdx ; //������ ����� �Ǵ� �ε��� �� �����
		for(int gijun=0; gijun < lastValue; gijun++) {
			changeIdx = gijun;
			//for���� ������ �����ε��� + 1 ������ �����ϰ� �������ε�������
			for (int i=gijun+1; i<num.length; i++) {
				//0, 1
				if(num[changeIdx] > num[i]) { // ���������Ϸ��� ��ȣ�� �ٲٸ� ��.
					changeIdx = i;
				} 
			}
			//���ذ��� ���� �ε����� ��ġ���� ��ȯ
			if(gijun != changeIdx) {
				System.out.println(gijun + " <-> " + changeIdx);
				temp = num[gijun];
				num[gijun] = num[changeIdx];
				num[changeIdx] = temp;
			}
			
			printData(num);
		}
		
	}
	
	//������ 10,20,30,40,50�� ������������ �ٲٰ� ������ 1,5�� �ٲٰ� 2,4�� ��ȯ�۾��� ���ָ�ȴ�.
	
	
	static void printData(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
