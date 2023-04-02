
public class Ready05 {
    public static void main(String[] args) {
        String string1;
        // ”あいう”の文字数を出力
        string1 = "あいう";
        System.out.println(string1 + "の文字数：" + string1.length());
        // ””（空文字）の文字数を出力
        string1 = "";
        System.out.println(string1 + "の文字数：" + string1.length());
        // nullの変数を参照するとNullPointerExceptionのエラー
     // string1 = null;
     // System.out.println(string1 + "の文字数：" + string1.length());
        
        
        int[] array1 = new int[3];  // 配列の宣言と生成
        array1[0] = 60;  // インデックス番号「0」を指定して１番目の要素にデータを代入
        array1[2] = 20;  // ２番目の要素より先に３番目の要素にデータを代入
        array1[1] = 20;  // ３番目と同じ値を２番目の要素に代入
        System.out.println(array1+ "の文字数：");
        System.out.println(array1[0]+ "の文字数：");
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        int int2 = array1[2];  // インデックス番号「2」を指定して３番目の要素を取得

        int array2[] = null;  // []は変数名の後ろでも可
        System.out.println(array1+ "の文字数：");
        
		 System.out.println("--------------");
		 System.out.println("配列 同じ型の複数のデータを１つの変数で扱えるようにしたもの");
		 System.out.println("配列宣言");
		 System.out.println("基本構文　データ型[] 配列変数名;");
		 System.out.println("配列作成");
		 System.out.println("基本構文　配列変数名= new データ型[要素数];");
		 System.out.println("配列の宣言と生成");
		 System.out.println("基本構文　データ型[] 配列変数名 = new データ型[要素数];");
	     System.out.println("int[] array1 = new int[3];");
		 System.out.println("--------------");
       
    }
}
