package Mondai11;

class Proguram{
    public static void main(String[] args){
        int x = 100;
        int y = 200;

        Plus plus = new Plus(x, y);
        int sum = plus.Matome();

        System.out.println(x + "から" + y + "までの合計値は" + sum + "です。");
    }
}