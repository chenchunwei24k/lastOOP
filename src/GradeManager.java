import java.util.Scanner;
//stu_score = {ID,Sname,Ccode,Cname,Score}
public class GradeManager {
	
	Student stud = new Student();
	
	Scanner scanner = new Scanner(System.in);
	int count = 0,i;
	
	public void add(){
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
			if(stud.ID[i].equals(name)) {
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This Student doesn't Exist!");
		}else {
			
			if(choice == 1){
				System.out.print("Please Input Student Exam Grade : ");
				Enum = scanner.nextInt();
				
				stud.exam.Grade[i] = Enum;
				
			}else if(choice == 2){
				System.out.print("Please Input Student Quiz Grade : ");
				Qnum = scanner.nextInt();
				
				stud.quiz.Grade[i] = Qnum;
				
			}else if(choice == 3){
				System.out.print("Please Input Student Exam Grade : ");
				Enum = scanner.nextInt();
				System.out.print("Please Input Student Quiz Grade : ");
				Qnum = scanner.nextInt();
				
				stud.exam.Grade[i] = Enum;
				stud.quiz.Grade[i] = Qnum;
				
			}else{
				System.out.println("Input Error!");
			}
			
		}
		
	}

	public void delete(){
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
			if(stud.ID[i].equals(name)) {
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This Student doesn't Exist!");
		}else {
			if(choice == 1){
				stud.exam.Grade[i] = -1;
			}else if(choice == 2){
				stud.quiz.Grade[i] = -1;
			}else if(choice == 3){
				stud.exam.Grade[i] = -1;
				stud.quiz.Grade[i] = -1;
			}else{
				System.out.println("Input Error!");
			}
		}
		
	}
	
	public void rewrite(){
		boolean found = false;
		int i, Enum, Qnum, choice;
		String name;
		
		System.out.println();
		System.out.print("Please Input Student ID : ");
		name = scanner.next();
		System.out.print("Please Rewrite Student's Grade : ");
		System.out.println("Choose selection : ");
		System.out.println("1.Rewrite Exam ");
		System.out.println("2.Rewrite Qxam  ");
		System.out.println("3.Rewrite Both ");
		System.out.print("Choice : ");
		choice = scanner.nextInt();
		
		for(i=0; i<4;i++) {
			if(stud.ID[i].equals(name)) {
				found = true;
				break;
			}
		}
		
		if(found == false) {
			System.out.println("This Student doesn't Exist!");
		}else {
			if(choice == 1){
				System.out.print("Input Rewrite Exam Grade : ");
				Enum = scanner.nextInt();
				stud.exam.Grade[i] = Enum;
			}else if(choice == 2){
				System.out.print("Input Rewrite Quiz Grade : ");
				Qnum = scanner.nextInt();
				stud.quiz.Grade[i] = Qnum;
			}else if(choice == 3){
				System.out.print("Input Rewrite Exam Grade : ");
				Enum = scanner.nextInt();
				System.out.print("Input Rewrite Quiz Grade : ");
				Qnum = scanner.nextInt();
				
				stud.exam.Grade[i] = Enum;
				stud.exam.Grade[i] = Qnum;
			}else{
				System.out.println("Input Error!");
			}
		}
		
	}
	
	public void search(){
		boolean found = false;
		int i,j;
		String name;
		
		System.out.println();
		System.out.print("Please Input Student ID : ");
		name = scanner.next();
		
		for(i=0; i<4; i++){
			if(stud.ID[i].equals(name)){
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
	
	public void getavg(){
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
