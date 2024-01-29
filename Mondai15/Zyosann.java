package Mondai15;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Zyosann {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        try{
            System.out.println("整数1 =");
            int num1 = stdIn.nextInt();
            System.out.println("整数2 =");
            int num2 = stdIn.nextInt();
            double ans = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + ans);

        }catch(ArithmeticException e){
            System.out.println("0による割り算です！！");
            System.out.println("強制終了");
        }
    }
}
