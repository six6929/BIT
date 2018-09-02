import java.util.Scanner;

public class referenceSunjuk {

   /* **** 성적처리(화면작업)
   성적처리(ver 1.0)
   -------------------------------
    1.조회   2.입력   3.수정   4.삭제    0.종료 
   -------------------------------
   >>작업선택: 
   ****************************/
   
   private StudentManager stu = new StudentManager();
   private Scanner sc = new Scanner(System.in);
   private Integer selNum = null;
   
   public void sungjukProc() {
      System.out.println("\t*** 성적처리(ver 1.0) ***");
      while(true) {
         menu();
         
         try {
         sc = new Scanner(System.in);
         selNum = Integer.parseInt(sc.next());
         } catch(NumberFormatException e) {
            System.out.println("***** [예외발생] 0~4 사이의 숫자값을 입력하십시오 *****");
            continue;
         }
         
         switch(selNum) {
         case 1:
            sc_check();
            break;
         case 2:
            sc_input();
            break;
         case 3:
            sc_update();
            break;
         case 4:
            sc_delete();
            break;
         case 0:
            sc_quit();
            return;
         default :
            System.out.println(">> 잘못된 값이 입력되었습니다. 0~4 사이의 숫자를 입력해 주십시오.");
            break;
         }
      }
   }
   
   public void menu() {
      System.out.println("----------------------------");
      System.out.println(" 1.조회 \t 2.입력 \t 3.수정 \t 4.삭제 \t 0.종료");
      System.out.println("----------------------------");
      System.out.print(">> 작업선택 : ");
   }
   
   public void sc_check() {
      System.out.println(">> 조회를 선택하셨습니다.");
      while(true) {
         System.out.println(">> 반 전체 성적을 조회하려면 1, 개인의 성적을 조회하려면 2, 이전 메뉴로 돌아가시려면 0을 입력하세요");
         System.out.println(">> ");
         
         selNum = Integer.parseInt(sc.next());
         
         switch(selNum) {
         case 1:
            stu.displayAll();
            break;
         case 2:
            checkOne();
            break;
         case 0:
            return;
         default:
            System.out.println("***** [예외발생] 0~2 사이의 숫자값을 입력하십시오 *****");
            continue;
         }
      }
   }
   
   public void checkAll() {
      stu.displayAll();
      return;
   }
   
   public void checkOne() {
      System.out.println(">> 조회하고자 하는 학생의 ID를 입력하십시오.");
      System.out.println(">> ");
      stu.displayOne(sc.next());
      return;
   }
      
   public void sc_input() {
      System.out.println(">> 입력을 선택하셨습니다.");
      System.out.println(">> 안내에 따라 다음 값들을 차례대로 입력하십시오.");
      System.out.println(">> 할당할 ID를 입력하십시오.");
      
      String stuID = sc.next();         //split으로도 해볼 것
      
      System.out.println(">> 이름을 입력하십시오.");
      String stuName = sc.next();
      
      System.out.println(">> 국어성적을 입력하십시오.");
      Integer stuKor = Integer.parseInt(sc.next());
      
      System.out.println(">> 영어성적을 입력하십시오.");
      Integer stuEng = Integer.parseInt(sc.next());
      
      System.out.println(">> 수학성적을 입력하십시오.");
      Integer stuMath = Integer.parseInt(sc.next());
         
      StudentVO sv = new StudentVO(stuID, stuName, stuKor, stuEng, stuMath);
      stu.insert(sv);
   }
   
   public void sc_update() {
      System.out.println(">> 수정을 선택하셨습니다.");
      System.out.println(">> 안내에 따라 다음 값들을 차례대로 입력하십시오.");
      System.out.println(">> 수정할 ID를 입력하십시오.");         //split으로도 해볼것
      String stuID = new String(sc.next());
      System.out.println(">> 이름을 입력하십시오.");
      String stuName = new String(sc.next());
      System.out.println(">> 국어성적을 입력하십시오.");
      Integer stuKor = new Integer(sc.next());
      System.out.println(">> 영어성적을 입력하십시오.");
      Integer stuEng = new Integer(sc.next());
      System.out.println(">> 수학성적을 입력하십시오.");
      Integer stuMath = new Integer(sc.next());
         
      StudentVO sv = new StudentVO(stuID, stuName, stuKor, stuEng, stuMath);
      stu.update(sv);
   }
   
   public void sc_delete() {
      while(true) {
         System.out.println(">> 정보를 삭제할 ID를 입력하십시오.");
         System.out.println(">> ");
         String str = sc.next();
         System.out.println(">> 삭제할 아이디가 " + str + "이 맞습니까?");
         System.out.println(">> 맞으면 1번, 아니면 2번을 입력하십시오.");
         System.out.println(">> ");
         String str2 = sc.next();
         if(str2.equals("1")) {
            stu.delete(str);
            return;
         } else if(str2.equals("2")) {
            continue;
         } else {
            System.out.println("잘못된 값입니다.");
            continue;
         }
      }
   }
   
   public void sc_quit() {
      System.out.println(">>2 성적처리 프로그램을 종료합니다.");
      System.out.println("***** 프로그램이 종료되었습니다 *****");
      return;
   }
   
   
}