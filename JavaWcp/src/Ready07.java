
public class Ready07 {
 public static void main(String args[]) {
     int number = 7;
     if (number < 5) {
         System.out.println(number + " は5未満です");
     }
     if (number < 10) {
         System.out.println(number + " は10未満です");
     }
     if (number < 15) {
         System.out.println(number + " は15未満です");
     }
     
     
     //if (条件式) {   
     //ブロック(処理文);
     //}  
     
     int number1 = 7;
     // if文：
     // numberが5未満の場合、ブロックの処理を実行
     if (number1 < 5) {
         // ブロック：「○ は5未満です」を出力
         System.out.println(number1 + " は5未満です");
     }
     // if文：
     // numberが10未満の場合、ブロックの処理を実行
     if (number1 < 10) {
         // ブロック：「○ は10未満です」を出力
         System.out.println(number1 + " は10未満です");
     }
     // if文：
     // numberが15未満の場合、ブロックの処理を実行
     if (number1 < 15) {
         // ブロック：「○ は15満です」を出力
         System.out.println(number1 + " は15未満です");
     }
     
     int number2 = 7;
     if (number2 < 5) {
         System.out.println(number2 + " は5未満です");
     } else if (number2 < 10) {
         System.out.println(number2 + " は5以上、10未満です");
     } else if (number2 < 15) {
         System.out.println(number2 + " は10以上、15未満です");
     } else {
         System.out.println(number2 + " は15未満でないです");
     }
     
     
     //if (条件式) {
     //	    ブロック(処理文);
     //	} else if (条件式) {
     //	    ブロック(処理文);
     //	} else if (条件式) {
     //	    ブロック(処理文);
     //	} else {
     //	    ブロック(処理文)
     //	}
 }
	
}
