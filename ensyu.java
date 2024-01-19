import java.util.Scanner;
import java.util.Random;

class Kzuate{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int no = rand.nextInt(100);

        System.out.println("数当てゲーム開始!");
        System.out.println("0~99の数を当ててください。");

        int x;
        do{
            System.out.print("いくつかな:");
            x = stdIn.nextInt();

            if (x > no)
              System.out.println("もっと小さな数だよ。");
            else
              System.out.println("もっと大きな数だよ。");
        }while(x != no);
        
        System.out.println("正解です。");
    }
}


class IsoscelsTriangle{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("左下直角の二等辺三角形を表示します。");
        System.out.print("段数は:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++)
              System.out.print('*');
            System.out.println();
        }
    }
}

class Max3method{
    static int max(int a, int b, int c){
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();
        System.out.print("整数c:"); int c = stdIn.nextInt();

        System.out.println("最大値は" + max(a, b, c) + "です。");
    }
}

class ReverseArray{
    //配列の要素a[idx1]とi[dx2]を交換
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }
    //配列aの要素の並びを反転
    static void reverse(int[] a){
        for (int i = 0; i < a.length / 2; i++)
          swap(a, i, a.length - i - 1);
    }

    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("要素数:");
            int num = stdIn.nextInt();

            int[] x = new int[num];

            for (int i = 0; i < num; i++){
                System.out.print("x[" + i + "]:");
                x[i] = stdIn.nextInt();
            }

            reverse(x);     //配列xの要素の並びを反転

            System.out.println("要素の並びを反転しました。");
            for (int i = 0; i < num; i++)
              System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}


