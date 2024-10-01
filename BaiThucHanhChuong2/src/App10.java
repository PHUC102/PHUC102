import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
      String chuoi;
      char kyTu;
      int count = 0;
      Scanner scanner = new Scanner(System.in);
      do {
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
      } while (chuoi.length() > 80);
        
      System.out.println("Nhập vào ký tự cần đếm số lần xuất hiện: ");
      kyTu = scanner.next().charAt(0);
        
      for (int i = 0; i < chuoi.length(); i++) {
        if (kyTu == chuoi.charAt(i)) {
            count++;
        }
    }
        
      System.out.println("Số lần xuất hiện của ký tự " + kyTu +
        " trong chuỗi " + chuoi + " = " + count); 
  }
    
}