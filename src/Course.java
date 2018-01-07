import java.util.Scanner;

public class Course {
	
	boolean Return = false;
	
	Scanner scanner = new Scanner(System.in);
	
	public void menu(GradeManager Manager, Student stud){
		while(true){
			System.out.println();
			System.out.println("Manager Menu:");
			System.out.println("Please select one action to use ");
			System.out.println("1.Add");
			System.out.println("2.Delete");
			System.out.println("3.Rewrite");
			System.out.println("4.Search");
			System.out.println("5.GetAVG");
			System.out.println("6.Return Course Menu");
			System.out.print("Input choice : ");
			String num = scanner.next();
			
			switch(num){
				case "1":
					Manager.add(stud);
					break;
				case "2":
					Manager.delete(stud);
					break;
				case "3":
					Manager.rewrite(stud);
					break;
				case "4":
					Manager.search(stud);
					break;
				case "5":
					Manager.getavg(stud);
					break;
				case "6":
					Return = true;
					break;
				default:
					System.out.println("Input Error!");
			}
			
			if(Return == true){
				break;
			}
			
		}
	}
	
}
