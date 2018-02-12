
public class Exercise_4 {

	public static void main(String[] args) {
		String str = new String( "Golf is a good walk spoiled." );

	    String sub1 = str.substring(15);
	    System.out.println(sub1);
	    
	    String sub2 = str.substring(15, 15);
	    System.out.println(sub2);
	    
	    String sub3 = str.substring(0, 28);
	    System.out.println(sub3);
	    
	    String sub4 = str.substring(0, str.length() - 1);
	    System.out.println(sub4);
	    
	    String sub5 = str.substring(0, 29);
	    System.out.println(sub5);
	    
	    String sub6 = str.substring(-1, 5);
	    System.out.println(sub6);
	    
	    String sub7 = str.substring(13, 6);
	    System.out.println(sub7);

	}

}
