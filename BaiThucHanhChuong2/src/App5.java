import java.util.Scanner;
public class App5 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
          System.out.println("Nhập số nguyên : ");
          number = sc.nextInt();
          sum += number;
        }while (sum<100); 
        System.out.println("Tổng các số nguyên vừa nhập = " + sum);

    }
}