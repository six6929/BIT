import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {
	
	public static void main(String[] args) {
		StudentVO stu = new StudentVO();
		Set set = new HashSet();

		System.out.println("======================================");
		set.add(new StudentVO("±§", 100, 80, 90));
		set.add(new StudentVO("∞≥", 95, 75, 95));
		set.add(new StudentVO("≈‰", 80, 90, 100));
		set.add(new StudentVO("¥Î", 50, 60, 70));
		set.add(new StudentVO("ø’", 100, 80, 100));
	
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("======================================");

		System.out.println("======================================");
		ArrayList stuArr = new ArrayList(set);
		stu.findName("±§", stuArr);
		stu.findName("≈‰", stuArr);
		stu.findName("ø®", stuArr);
		stu.findName("ø’", stuArr);
		System.out.println();
		System.out.println("======================================");
		
		System.out.println("======================================");
		stu.findAvg(90,stuArr);
		System.out.println();
		stu.findAvg(91,stuArr);
		System.out.println("======================================");
		
		
		
//		ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//		}
//		
		
	}
//	static void findName(String name, ArrayList stuArr) {
//		for(int i=0; i<stuArr.size(); i++){
//			if(name==((StudentVO) stuArr.get(i)).getName()) {
//				System.out.println(stuArr.get(i).toString());
//			}
//		}
//	}
//	
//	static void findAvg(double avg, ArrayList stuArr) {
//		for(int i=0; i<stuArr.size(); i++) {
//			if(((StudentVO)stuArr.get(i)).getAvg() >= avg) {
//				System.out.println(((StudentVO)stuArr.get(i)));
//			}
//		}
//	}
}