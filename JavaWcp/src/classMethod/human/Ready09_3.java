// 修飾子 戻り値の型 メソッド名(引数) {
//     // 処理
//     return 戻り値;
// }


package classMethod.human;
public class Ready09_3 {
  public String name;
  public int age;
  public String profession;
  
  public Ready09_3(){
	  this.name ="山田";
	  this.age = 20;
	  this.profession= "プログラマー";
  }
  
  public String getProfile() {
	  return "年齢は、"+this.age+"、職業は"+this.profession+"です.";
  }
  
  public void greet(String friend) {
	  if(friend == null) {
		 System.out.println("挨拶する友達がわかりません。");
		 return;
	  }
	     System.out.println(friend +"さん、こんにちは!");
  }
}
