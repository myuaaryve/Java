import java.util.Scanner;

class Gakko{
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            String school = stdIn.next();
            String name = stdIn.next();
            System.out.println("学校名:" + school);
            System.out.println("名前:" + name);
        }
    }
}