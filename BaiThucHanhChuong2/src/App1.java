import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        float num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 số bất kỳ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        System.out.printf( "\n%f + %f = %f",num1,num2,num1+num2);
        System.out.printf( "\n%f - %f = %f",num1,num2,num1-num2);
        System.out.printf( "\n%f * %f = %f",num1,num2,num1*num2);
        System.out.printf( "\n%f / %f = %f\n",num1,num2,num1/num2);
        if(num1>num2) System.out.println(num1 +" lớn hơn "+ num2);
        else if(num1<num2) System.out.println(num1 +" nhỏ hơn "+ num2);
        else System.out.println(num1 +" bằng "+ num2);
    }
}
