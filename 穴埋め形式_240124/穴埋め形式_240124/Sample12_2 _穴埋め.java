/**
 * 人クラス
 * 
*/
(__x__) (__x__) {
    // 名前
    (__x__) (__x__) = "";
    // 職業
    (__x__) (__x__) = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     */
    (__x__)

    /**
     * 自己紹介
     * 
     */
    (__x__)
}
     
        

/**
 * 教師クラス
 * 
 */
(__x__) (__x__) (__x__) (__x__) {

    // 担当科目
    (__x__) (__x__) = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        // 親クラスのコンストラクタを呼び出し
        (__x__)
        this.(__x__) = subject;
    }

    /**
     * 自己紹介
     * 
     */
    (__x__) {
        (__x__)
    }
}
     
/**
 * 料理人クラス
 * 
 */
(__x__) (__x__) (__x__) (__x__) {

    // 得意料理
    (__x__) (__x__) = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        // 親クラスのコンストラクタを呼び出し
        (__x__)
        this.(__x__) = specialities;
    }

    /**
     * 自己紹介
     * 
     */
    (__x__) {
        (__x__)
    }
}

/**
 * メイン処理クラス
 */
public class Sample12_2 { 
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人クラス作成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");
        
        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}

