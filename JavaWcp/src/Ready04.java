
public class Ready04 {
    public static void main(String[] args) {
    	
    	
    	
        System.out.println("変数について");
        int num1;  // int型の変数num1を宣言
        String str1;  // String型の変数str1を宣言
        num1 = 10;  // num1を初期化
        str1 = "Hello World!";  //str1を初期化
        System.out.println(num1);
        System.out.println(str1);

        num1 = 20;  // num1に20を再代入
        System.out.println(num1);

        int num2 = 30;  // int型の変数num2を宣言と同時に初期化
        System.out.println(num2);
       
		 System.out.println("--------------");
		 System.out.println("変数の宣言 変数を使用するには、変数を宣言する必要がある");
		 System.out.println("基本構文　型 変数名;");
		 System.out.println("代入 値を格納すること");
		 System.out.println("基本構文　型 変数名 = 代入するデータ;");
		 System.out.println("--------------");
		 
	        // 定数の宣言
	        final int MIN_NUMBER = 10;
	        System.out.println(MIN_NUMBER);

	        // 再代入しようとするとエラー
	        //MIN_NUMBER = 20;
			 System.out.println("--------------");
			 System.out.println("定数 初に代入した値を後から変更できない変数");
			 System.out.println("基本構文　final 定数の型 定数名 = 初期値;;");
			 System.out.println("--------------");
    }
}
