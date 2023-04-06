
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
	 
	 //代入演算子
	 
	 int e;

	 e = 10;  // a = 10：aに10を代入
	 System.out.println(e);
	 
	 e += 5;  // a = 15：aにa+5の結果を代入
	 System.out.println(e);
	 
	 e -= 3;  // a = 12：aにa-3の結果を代入
	 System.out.println(e);
	 
	 e *= 4;  // a = 48：aにa*4の結果を代入
	 System.out.println(e);
	 
	 e /= 2;  // a = 24：aにa/2の結果を代入
	 System.out.println(e);
	 
	 e %= 7;  // a = 3 ：aにa%7の結果を代入
	 System.out.print(e);
	 
	 //関係演算子
	 int aa = 5;
	 boolean ab;

	 ab = aa < 5;   // ab = false
	 System.out.println(ab);
	 ab = aa <= 5;  // ab = true
	 System.out.println(ab);
	 ab = aa > 4;   // ab = true
	 System.out.println(ab);
	 ab = aa>= 6;  // ab = false
	 System.out.println(ab);
	 ab = aa == 5;  // ab = true
	 System.out.println(ab);
	 ab = aa!= 5;  // ab = false
	 System.out.println(ab);
	 
	 //論理演算子
	 boolean ac = true;
	 boolean ae = false;
	 boolean ad;

	 ae = ac && true;   // c = true
	 System.out.println(ae);
	 ae = ac && false;  // c = false
	 System.out.println(ae);
	 ae = ab || true;   // c = true
	 System.out.println(ae);
	 ae = ab || false;  // c = false
	 System.out.println(ae);
	 ae = !ac;          // c = false
	 System.out.println(ae);
	 ae = !ab;          // c = true
	 System.out.println(ae);
	 
	 
	 //文字列の連結
	 String ba = "100";
	 String bb = "200";
	 String bc;
	 bc = ba + bb;        // c = 100200
	 System.out.println(bc);
	 bc = "あ" + "い";   // c = あい
	 System.out.println(bc);
	 
	 
	 //文字列の等価比較
	 String da = "applePie";
	 String dd = "apple";
	 String de = dd + "Pie";
	 dc = da == de;  // c = false
	 
	 String ea = "applePie";
	 String ef = new String("applePie");
	 ec = ea == ef;  // c = false
	 
	// 変数の中身はすぐ上の例と同じ
	 c = a.equals(b);  // c = true
	 c = a.equals(e);  // c = true
	 c = a.equals(f);  // c = true
 }
}
