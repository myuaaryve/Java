package Mondai11;

class Plus{
    int x;
    int y;

    public Plus(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int Matome(){
        int sum = 0;
        for (int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }
}