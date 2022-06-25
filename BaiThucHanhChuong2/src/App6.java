import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner sc = new Scanner(System.in);
        do{
          System.out.println("Nhập số nguyên : ");
          number = sc.nextInt();
        }while (number<=0); 
        int giaithua=1;
        if(number==1||number==0)
          System.out.println(number+"!= "+giaithua);
        else {
          for(int i=2;i<=number;i++)
            giaithua*=i;
        }
        System.out.println(number+"!= "+giaithua);
    }
}