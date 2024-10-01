import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số bất kỳ");
        num1 = sc.nextDouble();
        if(num1%2==0) System.out.println(num1 +" là số chẵn ");
        else System.out.println(num1 +" là số lẻ ");
    }
}
