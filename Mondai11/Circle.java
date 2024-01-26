package Mondai11;

class Circle{
    public double PI = 3.1415;
    public int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    // 円周
    public double feren (){
        return radius * 2 * PI;
    }
    // 面積
    public double area (){
        return radius * radius * PI;
    }
}
