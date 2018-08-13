
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
		StudentVO stu6 = new StudentVO("ø’", 100, 80, 100);
		
		Set set = new HashSet();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		set.add(stu6);
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
//		System.out.println(set.equals(stu1));
//		System.out.println(set.equals(stu2));
//		System.out.println(set.equals(stu3));
//		System.out.println(set.equals(stu4));
//		System.out.println(stu4.equals(stu5));
//		System.out.println(stu5.equals(stu6));
//		System.out.println(set.hashCode());
		System.out.println("-------------------------");
		ArrayList stuArr = new ArrayList(set);
		stu1.findAvg(90, stuArr);
		
	}
	
}
