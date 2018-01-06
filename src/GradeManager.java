import java.util.Scanner;
//stu_score = {ID,Sname,Ccode,Cname,Score}
public class GradeManager {
	String Sname,Cname,ID,Ccode,Score,Seat;
	String[][] stu_score = new String[5][5];
	
	
	
	Scanner scanner = new Scanner(System.in);
	int count = 0,i;
	
	public void add(){
		if(count<5){
			for(i=0;i<5;i++) {
				stu_score[count][i] = scanner.next();
			}
			count++;
		}else System.out.println("Full!");				
	}

	public void delete(String id){
		boolean found = false;
		int i;
		
		for(i=0; i<count; i++){
			if(stu_score[count][0].equals(id)){
				found = true;
				break;
			}
		}
		if(found == false){
			System.out.println("Student ID doesn't Exist!");
		}else{
			for(int j=i;j<4;j++) {
				for(int m=0;m<5;m++) {
					stu_score[j][m] = stu_score[j+1][m];
				}
			}
			
			for(int j= 0;j<5;j++) {
				stu_score[4][j]="null";
			}
			
			count--;
		}
	}
	
	public void rewrite(String id){
		boolean found = false;
		int i,j;
		
		for(i=0; i<count; i++){
			if(stu_score[count][0].equals(id)){
				found = true;
				break;
			}
		}
		if(found == false){
			System.out.println("Student ID doesn't Exist!");
		}else{
			stu_score[i][4] = scanner.next();
		}
	}
	
	public void search(String id){
		boolean found = false;
		int i,j;
		
		for(i=0; i<count; i++){
			if(stu_score[count][0].equals(id)){
				found = true;
				break;
			}
		}
		if(found == false){
			System.out.println("Student ID doesn't Exist!");
		}else{
			for(j=0;j<5;j++){
				System.out.print(stu_score[i][j]);
			}
		}
	}
	
	public void getavg(){
		int total=0;
		for(i=0;i<count;i++) {
			int a = Integer.valueOf(stu_score[i][4]);
			total += a;
		}
		System.out.print(total/count);
	}
	
	public void setnull() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				stu_score[i][j] = "null";
			}
		}
	}
}
