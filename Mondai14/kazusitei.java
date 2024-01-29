package Mondai14;
import java.util.Scanner;

public class kazusitei {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("文字列を入力:");
        String sum = stdIn.next();
        String sim = sum.substring(0, 12);
        System.out.println(sim);
    }
}
