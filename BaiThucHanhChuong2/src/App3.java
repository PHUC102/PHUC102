import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        double year;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        name = sc.nextLine();
        System.out.println("Nhập vào số năm");
        year = sc.nextDouble();
        double age=2022-year;
        if(age<16)
          System.out.println("Bạn "+name+" ở độ tuổi vị thành niên");
        if(age>=16&&age<18)
          System.out.println("Bạn "+name+" ở độ tuổi trưởng thành");
        if(age>=18)
          System.out.println("Bạn "+name+" đã già");
      }
}
