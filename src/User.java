public class User {
	
	private static String[] ID = {"D1234567", "D4567891"};
	private static String[] Password = {"123", "000"};
	
	public static boolean login(String account, String password){
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
