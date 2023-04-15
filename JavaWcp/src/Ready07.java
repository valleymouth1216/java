
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
 }
	
}
