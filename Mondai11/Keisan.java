package Mondai11;

class Keisan {
    public static int Sumnow;
    int x;
    int y;
    
    public Keisan(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int Goukei(){
        int num = 0;
        for (int i = x; i <= y; i++){
            num += i;
        }
        return num;
    }

}
