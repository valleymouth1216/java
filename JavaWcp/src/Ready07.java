
public class Ready07 {
 public static void main(String args[]) {
	 
	 //if文
     int number_if = 7;
     if (number_if < 5) {
         System.out.println(number_if + " は5未満です");
     }
     if (number_if < 10) {
         System.out.println(number_if + " は10未満です");
     }
     if (number_if < 15) {
         System.out.println(number_if + " は15未満です");
     }
     
     
     // if (条件式) {   
     //  ブロック(処理文);
     //  }
     
     // if文1：
     // numberが5未満の場合、ブロックの処理を実行
     if (number_if < 5) {
         // ブロック：「○ は5未満です」を出力
         System.out.println(number_if + " は5未満です");
     }
     // if文2：
     // numberが10未満の場合、ブロックの処理を実行
     if (number_if < 10) {
         // ブロック：「○ は10未満です」を出力
         System.out.println(number_if + " は10未満です");
     }
     // if文3：
     // numberが15未満の場合、ブロックの処理を実行
     if (number_if < 15) {
         // ブロック：「○ は15満です」を出力
         System.out.println(number_if + " は15未満です");
     }
     
     
     if(number_if < 8) {
    	 System.out.println("8より小さいです。");
     }
     
     
     
     //else-if文,else文
     int number_if2 =7;
      if(number_if2 < 5) {
    	  System.out.println(number_if2+"は5未満です");  
      }
       else if (number_if2 < 10 ) {
    	   System.out.println(number_if2 + "は5以上、10未満です。");
       }
       else if(number_if2 < 15 ) {
    	 System.out.println(number_if2 + "は5以上、15未満です");
       }
       else {
    	 System.out.println(number_if2 +"は15未満でないです。");  
       }
  
      // if (条件式) {
      //	ブロック(処理文);
      // } else if (条件式) {
      //    ブロック(処理文);
      // } else if (条件式) {
      //    ブロック(処理文);
      // } else {
      //    ブロック(処理文)
      // }
      
      //上の説明
      int number_if2_1 = 7;
      // if文：
      // numbe_if2_1rが5未満の場合、ブロックの処理を実行
      if (number_if2_1 < 5) {
          // ブロック：「○ は5未満です」を出力
          System.out.println(number_if2_1 + " は5未満です");
      // else-if文：
      // 前のif文、-の条件式の評価が全てflaseで、
      // number_if2_1が10未満の場合、ブロックの処理を実行
      } else if (number_if2_1 < 10) {
          // 評価がtrueなので、処理が実行される
          // ブロック：「○ は5以上、10未満です」を出力
          System.out.println(number_if2_1 + " は5以上、10未満です");
      // else-if文：
      // 前の条件式の評価が全てflaseで、number_if2_1が15未満の場合、ブロックの処理を実行
      } else if (number_if2_1 < 15) {
          // 評価はtrueだが、前の評価がtrueのため実行されない
          // ブロック：「○ は10以上、15未満です」を出力
          System.out.println(number_if2_1 + " は10以上、15未満です");
      // else文：
      // 前の条件式の評価が全てflaseの場合、ブロックの処理を実行
      } else {
          System.out.println(number_if2_1 + " は15未満でないです");
      }
      
      
      
      //Switch文
      int number_switch = 2;
       switch (number_switch) {
       case 3:
    	   System.out.println("よくできました。");
    	   break;
       case 2:
    	   System.out.println("ふつうでした。");
    	   break;
       default ://←なくてもいけるのでは
    	   System.out.println("がんばろう");
       }
      
      //switch (式（変数や値）){
      //case 値:
	  //  ブロック(処理);
	  //  break;
	  //case 値:
	 //   ブロック(処理);
	 //   break;
	 //default:
	 //   ブロック(処理);
	 //
     //}
       
       
       
       int number_switch1 = 2;
       // switch文：分岐処理の開始
       switch (number_switch1) {
       // case：値が3の場合にブロックを実行
       case 3:
           System.out.println("よくできました！");
           // break：switch文を終了する
           break;
       // case：値が2の場合にブロックを実行
       case 2:
           System.out.println("ふつうでした！");
           // break：switch文を終了する
           break;
       // default：全てのcaseの値に一致しない場合にブロックを実行
       default:
           System.out.println("がんばろう！");
       }
       
       //書き換え
       int number_switch2 =2;
        if (number_switch2 == 3){
        	System.out.println("よくできました");
        } else if (number_switch2 == 2) {
        	System.out.println("ふつうでした");
        } else {
        	System.out.println("がんばろう");
        }
        
        
        
        
        
        
        
        
       
       
 }
	
}
