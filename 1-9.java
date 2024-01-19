import java.util.Scanner;

class Mondai9{
    public static void main(String[] args){
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("お名前を入力してください:");
            String str = stdIn.next();

            System.out.println("こんにちは"+ str +"さん!");
        }
    }
}