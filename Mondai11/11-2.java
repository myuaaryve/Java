package Mondai11;

class Kaitou {
    public static void main(String[] args){
        int x = 100;
        int y = 200;

        Keisan Keisan = new Keisan(x, y);
        int num = Keisan.Goukei();

        System.out.println(x + "から" + y + "までの合計値は" + num + "です。");
        
    }
}