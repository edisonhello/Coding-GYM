package Loginsystem;

public class Check {
	private static String rightaccount = "123";
	private static String rightpassword = "567";
	public static void checkinformation(String a,String b)throws Accounterror,Passworderror,Allerror{
		boolean accountright = checkaccount(a);
		boolean passwordright = checkpassword(b);
		if(accountright!=true && passwordright!=true){
			throw new Allerror();
		}
		if(accountright!=true){
			throw new Accounterror();
		}
		if(passwordright!=true){
			throw new Passworderror();
		}
	}
	public static boolean checkaccount(String a){
		return a.equals(rightaccount);
	}
	public static boolean checkpassword(String b){
		return b.equals(rightpassword);
	}
}
