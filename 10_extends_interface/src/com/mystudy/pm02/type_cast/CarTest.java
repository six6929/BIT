package com.mystudy.pm02.type_cast;

//부모타입이 큰 타입이고 자식타입이 작은 타입
public class CarTest {

	public static void main(String[] args) {
		System.out.println("==== Car ====");
		Car car = new Car();
		car.type = "자동차";
		System.out.println("차량색 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("==== Ambulance ====");
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("===== FireEngine ======");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("--------------------------");
		//Car <- Ambulance
		Car carTemp = new Car();
		carTemp = am; //Car타입 변수에 Ambulance타입 객체를 저장
		carTemp.drive();
		carTemp.stop();
		Ambulance am2 = (Ambulance)carTemp;
		am2.siren();
		((Ambulance)(carTemp)).siren(); 
		
		System.out.println("---- Ambulance <- Car ----");
		//Ambulance <- Car : 부모타입을 자녀타입으로 형변환하는 것은 안됨
		//컴파일시에는 오류가 나지 않지만 실행시 ClasscastException 예외 발생됨
//		Ambulance amTemp = new Ambulance();
//		amTemp = (Ambulance)car; //Ambulance타입 변수에 Car 타입 객체를 저장
//		System.out.println(">>> ((Ambulance)car).siren ");
//		amTemp.siren();
		//문법적으로 오류가 나지 않지만 실행시키면 실행이 되지 않는다.
		//타입을 전환할 때 동작 시 발생 : 큰 타입을 작은 타입으로 바꿀 때는 실행이 되지 않는다
		//부모타입을 자녀타입으로 바꾸면 동작 X
		

/*
		//--------------------------------
		//소방차 <- 구급차
		// FireEngine <- Ambulance 두개의 타입은 서로 다른 타입임.
		// 형제관계는 형변환이 되지 않는다.
		
		System.out.println("---- FireEngine <- Ambulance ----");
		carTemp = am;
		fe = (FireEngine) carTemp;
		fe.siren();
		fe.water();
*/		
		
		System.out.println("---- instanceof 타입 확인 ----");
		carTemp = am; //Car <- Ambulance
		if (carTemp instanceof Car) { //carTemp가 Car 타입의 객체냐? 라는 의미이다.
			car.drive();
			car.stop();
		}
		if (carTemp instanceof Ambulance) {  //Ambulance 객체냐?
			((Ambulance)carTemp).siren();
		}
		if (carTemp instanceof FireEngine) { //FireEngine 객체냐?
			((FireEngine)carTemp).water();
			((FireEngine)carTemp).siren();			
		}
	
		System.out.println("---- function 동작 ----");
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
			//instanceof : 객체의 타입 확인
			//비교할객체 instanceof 비교클래스명
			if (car instanceof Ambulance) {  //Ambulance 객체냐?
				((Ambulance)car).siren();
			
			if (car instanceof FireEngine) { //FireEngine 객체냐?
				((FireEngine)car).water();
				((FireEngine)car).siren();			
			}
			}
		}
}
		


