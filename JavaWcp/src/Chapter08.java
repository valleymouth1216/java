public class Chapter08 {
 public static void main (String agrs[]) {
	 int number_while =1;
	 while (number_while <5) {
		 System.out.println(number_while*number_while);
		 number_while++;
	 }
	 
	 for (int number_for=4;number_for<5;number_for++ ) {
		 System.out.println(number_for*number_for);
	 }
	 
	 int array_for[]= {1,4,14,25};
	 for (int i = 0; i < array_for.length; i++) {
		 System.out.println(array_for[i]);
	 }
	 
     for (int number_for3 : array_for) {
     	if (number_for3%2==0) {
    		continue;
    	}
     	
    	System.out.println("number_for3 ="+ number_for3);
    	
     }
 }
}
