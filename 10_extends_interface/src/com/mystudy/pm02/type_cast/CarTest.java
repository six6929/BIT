package com.mystudy.pm02.type_cast;

//�θ�Ÿ���� ū Ÿ���̰� �ڽ�Ÿ���� ���� Ÿ��
public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== Car ====");
		Car car = new Car();
		car.type = "�ڵ���";
		System.out.println("������ : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("==== Ambulance ====");
		Ambulance am = new Ambulance();
		am.type = "������";
		System.out.println("Ÿ�� : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("===== FireEngine ======");
		FireEngine fe = new FireEngine();
		fe.type = "�ҹ���";
		System.out.println("Ÿ�� : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("--------------------------");
		//Car <- Ambulance
		Car carTemp = new Car();
		carTemp = am; //CarŸ�� ������ AmbulanceŸ�� ��ü�� ����
		carTemp.drive();
		carTemp.stop();
		Ambulance am2 = (Ambulance)carTemp;
		am2.siren();
		((Ambulance)(carTemp)).siren(); 
		
		System.out.println("---- Ambulance <- Car ----");
		//Ambulance <- Car : �θ�Ÿ���� �ڳ�Ÿ������ ����ȯ�ϴ� ���� �ȵ�
		//�����Ͻÿ��� ������ ���� ������ ����� ClasscastException ���� �߻���
//		Ambulance amTemp = new Ambulance();
//		amTemp = (Ambulance)car; //AmbulanceŸ�� ������ Car Ÿ�� ��ü�� ����
//		System.out.println(">>> ((Ambulance)car).siren ");
//		amTemp.siren();
		//���������� ������ ���� ������ �����Ű�� ������ ���� �ʴ´�.
		//Ÿ���� ��ȯ�� �� ���� �� �߻� : ū Ÿ���� ���� Ÿ������ �ٲ� ���� ������ ���� �ʴ´�
		//�θ�Ÿ���� �ڳ�Ÿ������ �ٲٸ� ���� X
		

/*
		//--------------------------------
		//�ҹ��� <- ������
		// FireEngine <- Ambulance �ΰ��� Ÿ���� ���� �ٸ� Ÿ����.
		// ��������� ����ȯ�� ���� �ʴ´�.
		
		System.out.println("---- FireEngine <- Ambulance ----");
		carTemp = am;
		fe = (FireEngine) carTemp;
		fe.siren();
		fe.water();
*/		
		
		System.out.println("---- instanceof Ÿ�� Ȯ�� ----");
		carTemp = am; //Car <- Ambulance
		if (carTemp instanceof Car) { //carTemp�� Car Ÿ���� ��ü��? ��� �ǹ��̴�.
			car.drive();
			car.stop();
		}
		if (carTemp instanceof Ambulance) {  //Ambulance ��ü��?
			((Ambulance)carTemp).siren();
		}
		if (carTemp instanceof FireEngine) { //FireEngine ��ü��?
			((FireEngine)carTemp).water();
			((FireEngine)carTemp).siren();			
		}
	
		System.out.println("---- function ���� ----");
		System.out.println("---- Car function ----");
		function(car);
		
		System.out.println("--- Ambulance function ----");
		function(am);
		System.out.println("---"
				+ " FireEngine function ----");
		function(fe);
	}
	
		static void function(Car car) {
			
			car.drive();
			car.stop();
			//instanceof : ��ü�� Ÿ�� Ȯ��
			//���Ұ�ü instanceof ��Ŭ������
			if (car instanceof Ambulance) {  //Ambulance ��ü��?
				((Ambulance)car).siren();
			
			if (car instanceof FireEngine) { //FireEngine ��ü��?
				((FireEngine)car).water();
				((FireEngine)car).siren();			
			}
			}
		}
}
		


