package Ensyuu;
import java.util.Scanner;

// 配列の要素に値を読み込んで並びを反転する(バグあり)

class ReverseArry1{
    // 配列の要素a[idex1]とa[idex2]を交換(例外を補足して強制終了)
    static void swap(int[] a, int idex1, int idex2){
        try{
            int t = a[idex1];
            a[idex1] = a[idex2];
            a[idex2] = t;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("メソッドswap内で不正なインデックスを検出しました。");
            System.out.println("プログラムを終了します。");
            System.exit(1);
        }


    }

    // 配列aの要素の並びを反転(誤り)
    static void reverse(int[] a){
        for (int i = 0; i < a.length / 2; i++)
          swap(a, i, a.length - i);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("要素数:");
        int num = stdIn.nextInt();  //要素数

        int[] x = new int[num];  //要素数numの配列

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        reverse(x);  // 配列xの要素の並びを反転

        System.out.println("要素の並びを反転しました。");
        for (int i = 0; i < num; i++)
          System.out.println("x[" + i + "]=" + x[i]);

    }
}