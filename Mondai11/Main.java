package Mondai11;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("半径を整数値で入力:");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        double feren = circle.feren();
        double area = circle.area();

        System.out.printf("円周の長さは%.3fです。\n" ,feren);
        System.out.printf("円の面積は%.3fです。\n" ,area);
    }
}