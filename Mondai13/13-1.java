package Mondai13;
import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

abstract class Person {
    /** 名前 */
	protected String name = "";

    /** 職業 */
    protected String job = "";

    /**
     * コンストラクタ
     * 
     * @param name
     * @param job
     */
    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    /**
     * 自己紹介
    */
    abstract public void introduce();
}

/**
 * 教員クラス
 */
class Teacher extends Person{

    /** 担当科目 */
    public String subject = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    /**
     * 自己紹介
     * 
     * 抽象メソッドの実装
     */
    @Override public void introduce() {
        System.out.println("氏名" + this.name);
        System.out.println("職種" + this.job);
        System.out.println("担当科目" + this.subject);
    }
}

/**
 * 料理人クラス
 */
class Cook extends Person {

    /** 得意料理 */
    public String specialities = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        super(name, job);
        this.specialities = specialities;
    }

    /**
     * 自己紹介
     * 
     * 抽象メソッドの実装
     */
    @Override public void introduce(){
       System.out.println("氏名" + name);
       System.out.println("職種"+ job);
       System.out.println("得意料理" + specialities);
    }
}


class Main {
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
