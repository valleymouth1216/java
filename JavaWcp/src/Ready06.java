
public class Ready06 {
 public static void main(String args[]) {
	 
	 //算術演算子
	 int a = 15; //変数宣言
	 
	 int c;
	 c = a + 3;  // c = 18　加算
	 System.out.println(c = a + 3);
	 
	 c = a - 5;  // c = 10 減算
	 System.out.println(c = a -5 );
	 
	 c = a * 2;  // c = 30 //乗算
	 System.out.println(c = a * 2);
	 
	 c = a / 6;  // c = 2 //除算
	 System.out.println(c = a / 6);
	 
	 c = a % 4;  // c = 3 //剰余算
	 System.out.println(c = a % 4);
	 
	 
	 
	 //インクリメント・デクリメント演算子
	 int b;
	 b = 10;
	 b++;  // a = 11
	 System.out.println(b++); //インクリメント
	 
	 b = 10;
	 b--;  // a = 9
	 System.out.println(b--);//デクリメント演算子
	 
	 //前置と後置
	 
	 int cd;
	 int d;

	 cd = 5;
	 d = ++cd;  // a をインクリメントした後に、a が c に代入される
	 // それぞれの値は、a が「6」で c も「6」
	 System.out.println(d);
	 System.out.println(cd);
	 
	 cd = 5;
	 d = cd++;  // a を c に代入した後に、a がインクリメントされる
	 System.out.println(d);
	 System.out.println(cd);
	 // それぞれの値は、a が「6」で c が「5」
	 
 }
}
