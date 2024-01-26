import java.util.Scanner;

abstract class Person {
    /** 名前 */
	(__x__) String name = "";

    /** 職業 */
    (__x__) String job = "";

    /**
     * コンストラクタ
     * 
     * @param name
     * @param job
     */
    (__x__)

    /**
     * 自己紹介
    */
    (__x__) (__x__) (__x__);
}

/**
 * 教員クラス
 */
(__x__) (__x__) (__x__) (__x__) {

    /** 担当科目 */
    (__x__) String subject = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        (__x__)
        this.(__x__) = subject;
    }

    /**
     * 自己紹介
     * 
     * 抽象メソッドの実装
     */
    (__x__) {
        (__x__)
    }
}

/**
 * 料理人クラス
 */
(__x__) (__x__) (__x__) (__x__) {

    /** 得意料理 */
    (__x__) String specialities = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        (__x__)
        this.(__x__) = specialities;
    }

    /**
     * 自己紹介
     * 
     * 抽象メソッドの実装
     */
    (__x__){
       (__x__)
    }
}


class Sample13_1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        // 教員クラスのインスタンスを生成
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        // 自己紹介の実行
        teacher.introduce();

        System.out.println("");

        // 料理人クラスのインスタンスを生成
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        // 自己紹介の実行
        cook.introduce();
        
        stdIn.close();
    }
}
