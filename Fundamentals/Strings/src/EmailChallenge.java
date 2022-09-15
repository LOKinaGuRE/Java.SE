

public class EmailChallenge {

	public static void main(String[] arg) {
	
	String s="Programmer@hotmail.com";
	System.out.print("Contain gmail ?  : ");
	System.out.println(s.endsWith("gmail.com"));
	//true if it is gmail
	
	int sLen 	= s.length();
	int ui	= s.indexOf('@');
	
	String userName 	= s.substring(0,ui);
	String domainName	= s.substring(ui+1 , sLen);

	System.out.println();
	System.out.println(userName + " " + domainName);
	
	}
}

