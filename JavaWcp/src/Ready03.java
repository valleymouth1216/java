
public class Ready03 {
	 public static void main(String[] args) {
		 System.out.println("// 1行のコメント例");
		 System.out.println("");
		 System.out.println("/*");
		 System.out.println("複数行の");
		 System.out.println("コメント例");
		 System.out.println("*/");
		 System.out.println("--------------");
		 System.out.println("↓ クラスブロックの始まり");
		 System.out.println("public class Ready02 {");
		 System.out.println("↓ メソッドブロックの始まり (インデントしてわかりやすくする)");
		 System.out.println(" public static void main(String[] args) {");
		 System.out.println("↓ コメントを追加 (メソッドブロックよりさらにインデントしてわかりやすくする)");
		 System.out.println("  // メソッドの処理を記述");
		 System.out.println("System.out.println(\"Hello World!\");   ← 文字列を出力する処理");
		 System.out.println("} ");
		 System.out.println(" ↑ メソッドブロックの終わり");
		 System.out.println("}");
		 System.out.println("↑ クラスブロックの終わり");
		 System.out.println("--------------");
		 System.out.println("mainメゾット 2種類");
		 System.out.println("public static void main(String[] args) {");
		 System.out.println("処理（文）!");
		 System.out.println("}");
		 System.out.println("public static void main(String... args) {");
		 System.out.println("処理（文）!");
		 System.out.println("}");
		 
	 }
	 
	// 1行のコメント例

	/*
	複数行の
	コメント例
	*/

}

//↓ クラスブロックの始まり
//public class Ready02 {
//    ↓ メソッドブロックの始まり (インデントしてわかりやすくする)
//    public static void main(String[] args) {
//        ↓ コメントを追加 (メソッドブロックよりさらにインデントしてわかりやすくする)
//        // メソッドの処理を記述
//        System.out.println("Hello World!");   ← 文字列を出力する処理
//    } 
//    ↑ メソッドブロックの終わり
//}
//↑ クラスブロックの終わり

//mainメゾット 2種類
//public static void main(String[] args) {
// 処理（文）
//}
//public static void main(String... args) {
// 処理（文）
//}