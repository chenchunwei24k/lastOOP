
public class User {
	
	private static String[] ID = {"D1234567", "D4567891"};
	private static String[] Password = {"123", "000"};
	
	private static String workplace;
	
	public User(int kind){
		if(kind == 1){
			workplace = "HighSchool";
		}else if(kind == 2){
			workplace = "CramSchool";
		}
	}
	
	public String Getter(){
		return this.workplace;
	}
	
	public static boolean login(String account, String password, int which){
		boolean found = false;
		
		int i;
		
		for(i=0; i<ID.length; i++){
			if(ID[i].equals(account)){
				found = true;
				break;
			}
		}
		if(found){
			found = false;
			if(Password[i].equals(password)){
				found = true;
				which = i+1;
			}
		}
		
		if(found){
			System.out.println("Login succeessful!");
			return true;
		}else{
			System.out.println("Account or Password wrong!");
			return false;
		}
	}
}
