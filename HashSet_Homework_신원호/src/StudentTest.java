import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
	
	public static void main(String[] args) {
		StudentVO stu1 = new StudentVO("±§", 100, 80, 90);
		StudentVO stu2 = new StudentVO("∞≥", 95, 75, 95);
		StudentVO stu3 = new StudentVO("≈‰", 80, 90, 100);
		StudentVO stu4 = new StudentVO("¥Î", 50, 60, 70);
		StudentVO stu5 = new StudentVO("ø’", 100, 80, 100);

		
		Set set = new HashSet();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
	
	
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
//		System.out.println(set.equals(stu1));
//		System.out.println(set.equals(stu2));
//		System.out.println(set.equals(stu3));
//		System.out.println(set.equals(stu4));
//		System.out.println(set.equals(stu5));
		
		System.out.println("---------------");
		ArrayList stuArr = new ArrayList(set);
		findName("±§", stuArr);
		findName("≈‰", stuArr);
		findName("ø®", stuArr);
		findName("ø’", stuArr);
		
		System.out.println();
		findAvg(90,stuArr);
		System.out.println();
		findAvg(30,stuArr);
		System.out.println();
		findAvg(95,stuArr);
		
		
		
//		ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
//		
		
	}
	static void findName(String name, ArrayList stuArr) {
		for(int i=0; i<stuArr.size(); i++){
			if(name==((StudentVO) stuArr.get(i)).getName()) {
				System.out.println(stuArr.get(i).toString());
			}
		}
	}
	
	static void findAvg(double avg, ArrayList stuArr) {
		for(int i=0; i<stuArr.size(); i++) {
			if(((StudentVO)stuArr.get(i)).getAvg() >= avg) {
				System.out.println(((StudentVO)stuArr.get(i)));
			}
		}
	}
}