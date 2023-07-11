import classMethod.human.Ready09_3;

public class o {

    public static void main(String[] args) {
        Ready09_3 yamada = new Ready09_3();

        
        
        
        
        

        
        System.out.println("私の名前は、" + yamada.name + "です。");
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");

        
        yamada.greet("田辺");
        yamada.greet(null);
    }
	
	
}
