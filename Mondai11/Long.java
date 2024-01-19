package Mondai11;

import java.util.Scanner;

class Long{
    public static void main(Integer[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("半径を整数値で入力:");
            int i = stdIn.nextInt();
            double Circle = 3.1215;
            double tool = i * i * Circle;
        }
    }
}