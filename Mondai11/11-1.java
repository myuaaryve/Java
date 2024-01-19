package Mondai11;
import java.util.Scanner;


class Ennsyu{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("半径を整数値で入力:");
        int i = stdIn.nextInt();
        Long Long = new Long();
        Area area = new Area();

        System.out.println("円周の長さは" + Long + "です。");
        System.out.println("円の面積は" + area + "です。");
    }
}

