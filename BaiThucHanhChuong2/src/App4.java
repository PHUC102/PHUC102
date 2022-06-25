import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        month = sc.nextInt();
        switch(month){
          case 1: System.out.println("Tháng 1");
          case 2: System.out.println("Tháng 2");
          case 3: System.out.println("Tháng 3");
          case 4: System.out.println("Tháng 4");
          case 5: System.out.println("Tháng 5");
          case 6: System.out.println("Tháng 6");
          case 7: System.out.println("Tháng 7");
          case 8: System.out.println("Tháng 8");
          case 9: System.out.println("Tháng 9");
          case 10: System.out.println("Tháng 10");
          case 11: System.out.println("Tháng 11");
          case 12: System.out.println("Tháng 12");
          break;
          default:System.out.println("Số tháng sai");
        }
      }
}
