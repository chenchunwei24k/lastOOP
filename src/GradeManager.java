import java.util.Scanner;

public class GradeManager {
	
	Scanner scanner = new Scanner(System.in);
	int count = 0,i;
	
	public void add(Student stud){
		String name;
		int Enum, Qnum;
		int i, choice;
		boolean found = false;
		
		System.out.println();
		System.out.print("Please Input Student ID : ");
		name = scanner.next();
		
		System.out.println();
		System.out.println("Choose selection : ");
		System.out.println("1.Add Exam Grade");
		System.out.println("2.Add Qxam Grade");
		System.out.println("3.Add Both Grade");
		System.out.print("Choice : ");
		choice = scanner.nextInt();
		
		for(i=0; i<4;i++) {
			if(stud.ID[i].equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This Student doesn't Exist!");
		}else {
			
			if(choice == 1){
				
				if(stud.exam.Grade[i]!= -1)
					System.out.println("This Student already have exam grade in this subject!");
				else{
				System.out.print("Please Input Student Exam Grade : ");
				Enum = scanner.nextInt();
				stud.exam.Grade[i] = Enum;
				}
			}else if(choice == 2){
				
				if(stud.quiz.Grade[i]!= -1)
					System.out.println("This Student already have quiz grade in this subject!");
				else{
					System.out.print("Please Input Student Quiz Grade : ");
					Qnum = scanner.nextInt();
					stud.quiz.Grade[i] = Qnum;
				}
			}else if(choice == 3){
				
				if(stud.exam.Grade[i]!= -1)
					System.out.println("This Student already have exam grade in this subject!");
					else{
						System.out.print("Please Input Student Exam Grade : ");
						Enum = scanner.nextInt();
						stud.exam.Grade[i] = Enum;
					}
				if(stud.quiz.Grade[i]!= -1)
						System.out.println("This Student already have quiz grade in this subject!");
					else{
						System.out.print("Please Input Student Quiz Grade : ");
						Qnum = scanner.nextInt();
						stud.quiz.Grade[i] = Qnum;
					}
			}else{
				System.out.println("Input Error!");
			}
			
		}
		
	}

	public void delete(Student stud){
		boolean found = false;
		String name;
		int i, choice;
		
		System.out.println();
		System.out.print("Please Input Student ID : ");
		name = scanner.next();
		System.out.println();
		System.out.println("Choose selection : ");
		System.out.println("1.Delete Exam ");
		System.out.println("2.Delete Qxam  ");
		System.out.println("3.Delete Both ");
		System.out.print("Choice : ");
		choice = scanner.nextInt();
		
		for(i=0; i<4;i++) {
			if(stud.ID[i].equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This Student doesn't Exist!");
		}else {
			if(choice == 1){
				if(stud.exam.Grade[i]== -1)
					System.out.println("This Student don't have exam grade in this subject!");
					else
						stud.exam.Grade[i] = -1;
			}else if(choice == 2){
				if(stud.quiz.Grade[i]== -1)
					System.out.println("This Student don't have exam grade in this subject!");
					else
						stud.quiz.Grade[i] = -1;
			}else if(choice == 3){
				if(stud.exam.Grade[i]== -1)
					System.out.println("This Student don't have exam grade in this subject!");
					else
						stud.exam.Grade[i] = -1;
				if(stud.quiz.Grade[i]== -1)
					System.out.println("This Student don't have exam grade in this subject!");
					else
						stud.quiz.Grade[i] = -1;
			}else{
				System.out.println("Input Error!");
			}
		}
		
	}
	
	public void rewrite(Student stud){
		boolean found = false;
		int i, Enum, Qnum, choice;
		String name;
		
		System.out.println();
		System.out.print("Please Input Student ID : ");
		name = scanner.next();
		System.out.println("Choose selection : ");
		System.out.println("1.Rewrite Exam ");
		System.out.println("2.Rewrite Qxam  ");
		System.out.println("3.Rewrite Both ");
		System.out.print("Choice : ");
		choice = scanner.nextInt();
		
		for(i=0; i<4;i++) {
			if(stud.ID[i].equalsIgnoreCase(name)) {
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This Student doesn't Exist!");
		}else {
			if(choice == 1){
				if(stud.exam.Grade[i]== -1)
					System.out.println("This Student dont't have exam grade in this subject!");
				else{
					System.out.print("Input Rewrite Exam Grade : ");
					Enum = scanner.nextInt();
					stud.exam.Grade[i] = Enum;
				}
			}else if(choice == 2){
				
				if(stud.quiz.Grade[i]== -1)
					System.out.println("This Student dont't have quiz grade in this subject!");
				else{
				System.out.print("Input Rewrite Quiz Grade : ");
				Qnum = scanner.nextInt();	
				stud.quiz.Grade[i] = Qnum;
				}
			}else if(choice == 3){
				
				if(stud.exam.Grade[i]== -1)
					System.out.println("This Student dont't have exam grade in this subject!");
					else{
						System.out.print("Input Rewrite Exam Grade : ");
						Enum = scanner.nextInt();
						stud.exam.Grade[i] = Enum;
					}
				if(stud.quiz.Grade[i]== -1)
						System.out.println("This Student dont't have quiz grade in this subject!");
					else{
						System.out.print("Input Rewrite Quiz Grade : ");
						Qnum = scanner.nextInt();
						stud.quiz.Grade[i] = Qnum;
					}
			}else{
				System.out.println("Input Error!");
			}
		}
		
	}
	
	public void search(Student stud){
		boolean found = false;
		int i,j;
		String name;
		
		System.out.println();
		System.out.print("Please Input Student ID : ");
		name = scanner.next();
		
		for(i=0; i<4; i++){
			if(stud.ID[i].equalsIgnoreCase(name)){
				found = true;
				break;
			}
		}
		
		if(found == false){
			System.out.println("Student ID doesn't Exist!");
		}else{
			System.out.println("Search result ('-1' means there is no grade) : ");
			System.out.println("Student Exam Grade is " + stud.exam.Grade[i]);
			System.out.println("Student Quiz Grade is " + stud.quiz.Grade[i]);
		}
		
	}
	
	public void getavg(Student stud){
		int Etotal=0, Qtotal=0;
		double Ecount = 0.0, Qcount = 0.0, E, Q;
		
		System.out.println();
		for(i=0;i<4;i++) {
			if(stud.exam.Grade[i]>=0){
				Etotal = Etotal + stud.exam.Grade[i];
				Ecount++;
			}
			if(stud.quiz.Grade[i]>=0){
				Qtotal = Qtotal + stud.quiz.Grade[i];
				Qcount++;
			}
		}
		
		E = (double)Etotal/Ecount;
		Q = (double)Qtotal/Qcount;
		
		System.out.println("Student Exam Average Grade is " + E);
		System.out.println("Student Quiz Average Grade is " + Q);
		
	}
	
}
