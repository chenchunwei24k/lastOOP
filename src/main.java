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
				Student Mathstud = new Student();
				
				Course Chinese = new Course();
				GradeManager ChineseManager = new GradeManager();
				Student Chinesestud = new Student();
				
				Course English = new Course();
				GradeManager EnglishManager = new GradeManager();
				Student Englishstud = new Student();
				
				while(true){
					String num;
					System.out.println();
					System.out.println("Teacher Menu:");
					System.out.println("Please select one Course system to use ");
					System.out.println("1.Math");
					System.out.println("2.Chinese");
					System.out.println("3.English");
					System.out.println("4.AVG of three Course");
					System.out.println("5.Logout");
					System.out.print("Input choice : ");
					
					num = scanner.next();
					
					switch(num){
						case "1":
							Math.menu(MathManager,Mathstud);
							break;
						case "2":
							Chinese.menu(ChineseManager,Chinesestud);
							break;
						case "3":
							English.menu(EnglishManager,Englishstud);
							break;
						case "4":
							int i=0;
							double Etotal = 0.0, Qtotal = 0.0, Eavg, Qavg;
							String studnum;
							boolean found = false;
							
							System.out.println();
							System.out.print("Please Input Student ID : ");
							studnum = scanner.next();
							
							for(i=0; i<4; i++){
								if(Mathstud.ID[i].equals(studnum)){
									found = true;
									break;
								}
							}
							
							
							if(found == false){
								System.out.println("This Student doesn't Exist!");
							}else{
								Etotal = Etotal + (double)Mathstud.exam.Grade[i]*3;
								Etotal = Etotal + (double)Chinesestud.exam.Grade[i];
								Etotal = Etotal + (double)Englishstud.exam.Grade[i]*2;
								Eavg = Etotal/3.0;
								
								Qtotal = Qtotal + (double)Mathstud.quiz.Grade[i]*3;
								Qtotal = Qtotal + (double)Chinesestud.quiz.Grade[i];
								Qtotal = Qtotal + (double)Englishstud.quiz.Grade[i]*2;
								Qavg = Qtotal/3.0;
								
								System.out.println("Student " + Mathstud.Name[i] + "'s Exam Average Grade is " + Qavg);
								System.out.println("Student " + Mathstud.Name[i] + "'s Quiz Average Grade is " + Eavg);
								
							}
							
							break;
						case "5":
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
