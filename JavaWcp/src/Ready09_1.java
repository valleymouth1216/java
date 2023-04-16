
public class Ready09_1 {
   public static void main(String[] args) {
	   Ready09 yamada = new Ready09();
	   System.out.println("名前は"+ yamada.name +"で、年齢は"+ yamada.age+"です.");
	   
	   Ready09 sato = new Ready09("佐藤",25);
	   System.out.println("名前は"+ sato.name +"で、年齢は"+ sato.age+"です.");
   }
   
   // package パッケージ名;
   // import パッケージ名.クラス名;
   // import パッケージ名.*;
}
