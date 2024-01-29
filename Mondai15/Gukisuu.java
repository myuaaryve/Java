package Mondai15;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Gukisuu {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        try{
        System.out.println("整数を入力 =");
        int kri = stdIn.nextInt();
        if (kri % 2==0){
            System.out.println(kri + "は偶数");
        }else{
            System.out.println(kri + "は奇数");
        }
        
        }catch(ArithmeticException e){
            System.out.println("整数と認識できません！！");
        }
    }
}
