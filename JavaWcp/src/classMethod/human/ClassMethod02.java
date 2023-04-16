// パッケージ宣言
package classMethod.human;

public class ClassMethod02 {
    public static void main(String[] args) {
        human02 yamada = new human02();  //Human02クラスのインスタンスを生成
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        human02 sato = new human02("佐藤", 25); //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }
}