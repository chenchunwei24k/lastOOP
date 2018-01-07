import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			boolean flag = false, logout = false;
			System.out.println();
			System.out.print("Input Account : ");
			String account = scanner.next();
			System.out.print("Input Password : ");
			String password = scanner.next();
			
			flag = User.login(account, password);
			
			if(flag == true){
				
				Course Math = new Course();
				GradeManager MathManager = new GradeManager();
				Course Chinese = new Course();
				GradeManager ChineseManager = new GradeManager();
				Course English = new Course();
				GradeManager EnglishManager = new GradeManager();
				
				while(true){
					String num;
					System.out.println();
					System.out.println("Teacher Menu:");
					System.out.println("Please select one Course system to use ");
					System.out.println("1.Math");
					System.out.println("2.Chinese");
					System.out.println("3.English");
					System.out.println("4.Logout");
					System.out.print("Input choice : ");
					
					num = scanner.next();
					
					switch(num){
						case "1":
							Math.menu(MathManager);
							break;
						case "2":
							Chinese.menu(ChineseManager);
							break;
						case "3":
							English.menu(EnglishManager);
							break;
						case "4":
							logout = true;
							break;
						default:
							System.out.println("Input Error!");
					}
					
					if(logout == true){
						break;
					}
					
				}
			}
			
		}
		
	}

}
