import java.util.Scanner;

public class referenceSunjuk {

   /* **** ����ó��(ȭ���۾�)
   ����ó��(ver 1.0)
   -------------------------------
    1.��ȸ   2.�Է�   3.����   4.����    0.���� 
   -------------------------------
   >>�۾�����: 
   ****************************/
   
   private StudentManager stu = new StudentManager();
   private Scanner sc = new Scanner(System.in);
   private Integer selNum = null;
   
   public void sungjukProc() {
      System.out.println("\t*** ����ó��(ver 1.0) ***");
      while(true) {
         menu();
         
         try {
         sc = new Scanner(System.in);
         selNum = Integer.parseInt(sc.next());
         } catch(NumberFormatException e) {
            System.out.println("***** [���ܹ߻�] 0~4 ������ ���ڰ��� �Է��Ͻʽÿ� *****");
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
            System.out.println(">> �߸��� ���� �ԷµǾ����ϴ�. 0~4 ������ ���ڸ� �Է��� �ֽʽÿ�.");
            break;
         }
      }
   }
   
   public void menu() {
      System.out.println("----------------------------");
      System.out.println(" 1.��ȸ \t 2.�Է� \t 3.���� \t 4.���� \t 0.����");
      System.out.println("----------------------------");
      System.out.print(">> �۾����� : ");
   }
   
   public void sc_check() {
      System.out.println(">> ��ȸ�� �����ϼ̽��ϴ�.");
      while(true) {
         System.out.println(">> �� ��ü ������ ��ȸ�Ϸ��� 1, ������ ������ ��ȸ�Ϸ��� 2, ���� �޴��� ���ư��÷��� 0�� �Է��ϼ���");
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
            System.out.println("***** [���ܹ߻�] 0~2 ������ ���ڰ��� �Է��Ͻʽÿ� *****");
            continue;
         }
      }
   }
   
   public void checkAll() {
      stu.displayAll();
      return;
   }
   
   public void checkOne() {
      System.out.println(">> ��ȸ�ϰ��� �ϴ� �л��� ID�� �Է��Ͻʽÿ�.");
      System.out.println(">> ");
      stu.displayOne(sc.next());
      return;
   }
      
   public void sc_input() {
      System.out.println(">> �Է��� �����ϼ̽��ϴ�.");
      System.out.println(">> �ȳ��� ���� ���� ������ ���ʴ�� �Է��Ͻʽÿ�.");
      System.out.println(">> �Ҵ��� ID�� �Է��Ͻʽÿ�.");
      
      String stuID = sc.next();         //split���ε� �غ� ��
      
      System.out.println(">> �̸��� �Է��Ͻʽÿ�.");
      String stuName = sc.next();
      
      System.out.println(">> ������� �Է��Ͻʽÿ�.");
      Integer stuKor = Integer.parseInt(sc.next());
      
      System.out.println(">> ������� �Է��Ͻʽÿ�.");
      Integer stuEng = Integer.parseInt(sc.next());
      
      System.out.println(">> ���м����� �Է��Ͻʽÿ�.");
      Integer stuMath = Integer.parseInt(sc.next());
         
      StudentVO sv = new StudentVO(stuID, stuName, stuKor, stuEng, stuMath);
      stu.insert(sv);
   }
   
   public void sc_update() {
      System.out.println(">> ������ �����ϼ̽��ϴ�.");
      System.out.println(">> �ȳ��� ���� ���� ������ ���ʴ�� �Է��Ͻʽÿ�.");
      System.out.println(">> ������ ID�� �Է��Ͻʽÿ�.");         //split���ε� �غ���
      String stuID = new String(sc.next());
      System.out.println(">> �̸��� �Է��Ͻʽÿ�.");
      String stuName = new String(sc.next());
      System.out.println(">> ������� �Է��Ͻʽÿ�.");
      Integer stuKor = new Integer(sc.next());
      System.out.println(">> ������� �Է��Ͻʽÿ�.");
      Integer stuEng = new Integer(sc.next());
      System.out.println(">> ���м����� �Է��Ͻʽÿ�.");
      Integer stuMath = new Integer(sc.next());
         
      StudentVO sv = new StudentVO(stuID, stuName, stuKor, stuEng, stuMath);
      stu.update(sv);
   }
   
   public void sc_delete() {
      while(true) {
         System.out.println(">> ������ ������ ID�� �Է��Ͻʽÿ�.");
         System.out.println(">> ");
         String str = sc.next();
         System.out.println(">> ������ ���̵� " + str + "�� �½��ϱ�?");
         System.out.println(">> ������ 1��, �ƴϸ� 2���� �Է��Ͻʽÿ�.");
         System.out.println(">> ");
         String str2 = sc.next();
         if(str2.equals("1")) {
            stu.delete(str);
            return;
         } else if(str2.equals("2")) {
            continue;
         } else {
            System.out.println("�߸��� ���Դϴ�.");
            continue;
         }
      }
   }
   
   public void sc_quit() {
      System.out.println(">>2 ����ó�� ���α׷��� �����մϴ�.");
      System.out.println("***** ���α׷��� ����Ǿ����ϴ� *****");
      return;
   }
   
   
}