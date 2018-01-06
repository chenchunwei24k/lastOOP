import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			boolean flag = false, logout = false;
			int kind = 0;
			System.out.print("Input Account : ");
			String account = scanner.next();
			System.out.print("Input Password : ");
			String password = scanner.next();
			
			flag = User.login(account, password);
			
			if(flag == true){
				
				
				while(true){
					System.out.println("Teacher Menu:");
					System.out.println("1.Add");
					System.out.println("2.Delete");
					System.out.println("3.Rewrite");
					System.out.println("4.Search");
					System.out.println("5.Getavg");
					System.out.println("6.Logout");
					System.out.print("Input choice : ");
					
					int num = scanner.nextInt();
					
					switch(num){
						case 1:
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							logout = true;
					}
					
					if(logout == true){
						break;
					}
					
				}
			}
			
		}
		
	}

}
