package Mondai14;
import java.util.Scanner;

public class mozisu {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列を入力:");
        String mz = stdIn.next();

        System.out.println("入力された文字数は" + mz.length() + "です。");
    }
    
}
