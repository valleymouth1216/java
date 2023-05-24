
public class Ready08 {
	public static void main (String agrs[]) {
		//while 
		System.out.println("while文");
		int number_while =1;
		 while (number_while < 50 ) {
			 number_while *=2;
			 System.out.println("number_while = "+number_while+"("+number_while+"*2"+")");
		 }
		 
		 //while (条件式) {
		 //   ブロック（繰り返し処理）
		 //   }
		 
		 
	        int number_while1 = 1;
	        // while文：ループ開始
	        // numberが50未満の場合、ブロックの処理を行なう
	        while (number_while1 < 50) {
	            // ブロック：
	            // numberにnumber * 2 を代入して、numberを出力
	            number_while1 *= 2;
	            System.out.println("While01 = " + number_while1);
	        }
	        
	        
	        
	        
	        
	       //do-while文
	        System.out.println("do-while文");
	        int number_do_while = 1;
	        do {
	        	number_do_while *=2;
	        	System.out.println("number_do_while = " + number_do_while);
	        }while(number_do_while < 50);
	        
	       // do {
	       //     ブロック（繰り返し処理）
	       // } while (条件式);
	        
	        
	        int number_do_while1 = 1;
	        // do-while文：ループ開始
	        do {
	            // ブロック：
	            // numberにnumber * 2 を代入して、numberを出力
	            number_do_while1 *= 2;
	            System.out.println("DoWhile01 = " + number_do_while1);
	        // do-while文：
	        // numberが50未満の場合、ブロックの処理をループ実行する
	        } while (number_do_while1 < 50);
	        
	        
	        
	        
	        
	        
	        
	        //for文
	        System.out.println("for文");
	        for (int number_for =1;number_for <=5;number_for++) {
	        	System.out.println("number_for = "+number_for);
	        }
	        
	        //for (初期化式; 条件式; 変化式) {
	        //ブロック(繰り返し処理)
	        //}
	        
	        
	        // for文：
	        // 初期化式：numberを1で初期化
	        // 条件式：numberが5未満の場合、ブロックの処理を行う
	        // 変化式：ブロックの処理後に、numberをインクリメント
	        for (int number_for1 = 1; number_for1 <= 5; number_for1++) {
	            // ブロック：numberを出力
	            System.out.println("For01 = " + number_for1);
	        }
	        
	        
	        
	        
	        
	        //拡張for文
	        System.out.println("拡張for文");
	        int []array_for = {1,2,3,4,5};
	        for (int number_for2 :array_for) {
	        	System.out.println("number_for2 = "+number_for2);
	        }
	        
	        //for (型 変数名：配列やコレクションの変数) {
	        //ブロック(繰り返し処理)
	        //}
	        
	        
	        int[] array_for3 = { 1, 2, 3, 4, 5 };
	        // 拡張for文：
	        // 配列の要素を順番にnumberに代入し、要素分繰り返す
	        for (int number_for3 : array_for3) {
	            // ブロック：numberを出力
	            System.out.println("For02 = " + number_for3);
	        }
	        
	        
	        
	        
	        
	        //break文:switch文のbreak文と同じで、ループ処理の途中でループ処理を終了させたい場合に使用する制御文
	        System.out.println("break文");
	        for (int count_break =0;count_break<5;count_break++) {
	        	if (count_break ==2) {
	        		break;
	        	}
	        	 System.out.println("count_break = " + count_break);
	        }
	        
	        
	        
	        
	        
	        //continue文:ループ処理の途中でその後の処理をスキップして、ループ処理の最初から実行させたい場合に使用する制御文
	        System.out.println("continue文");
	        for (int count_continue = 0;count_continue<5;count_continue++) {
	        	if (count_continue ==2) {
	        		continue;
	        	}
	        	System.out.println("count_continue ="+ count_continue);
	        	
	        }
	        
	        
	        
	        
	        
	        //再帰処理 あるメソッドが自分自身を呼び出すことで繰り返しを実現すること
	        System.out.println("再帰処理");
	        int number =1 ;
	        printNum(number);
	       }
	        
	        
	        
	        public  static int printNum(int number) {
	        	if(number < 50) {
	        	number *=2;
	        	System.out.println("number = "+number);
	        	 // 条件にマッチしたら自分自身を再度呼び出す
	        	printNum(number);
	        	}
	        	return number;
	        }
	
}
