
public class Student {
	public static String[] Name = {"BoBo", "Bear", "Father", "Jun", "null", "null"};
	public static String[] ID = {"S1", "S2", "S3", "S4", "null", "null"};
	public int count = 4;
	
	public boolean cheak(String id){
		boolean found = false;
		for(int i=0; i<count; i++){
			if(ID[i].equals(id)){
				found = true;
				break;
			}
		}
		
		if(found = true){
			System.out.println("Found the Student Success!");
			return true;
		}else{
			System.out.println("This Student doesn't Exist!");
			return false;
		}
		
	}
	
	public void add(String name, String id){
		if(count == 6){
			System.out.println("Oversize of Student!");
		}else{
			this.Name[count] = name;
			this.ID[count] = id;
			count++;
		}
	}
	
	public void delete(String id){
		boolean found = false;
		int i;
		
		for(i=0; i<count; i++){
			if(ID[i].equals(id)){
				found = true;
				break;
			}
		}
		
		if(found == false){
			System.out.println("Student ID doesn't Exist!");
		}else{
			Name[i] = "null";
			ID[i] = "null";
			count--;
		}
		
	}
	
	public void search(String id){
		boolean found = false;
		int i;
		
		for(i=0; i<count; i++){
			if(ID[i].equals(id)){
				found = true;
				break;
			}
		}
		
		if(found == false){
			System.out.println("Student ID doesn't Exist!");
		}else{
			
		}
	}
	
}
