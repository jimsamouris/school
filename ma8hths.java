import java.util.ArrayList;

public class Student {
	
	private String firstName;
	private String lastName;
	private String AMM; // Arithmos Mitroou Mathiti
	ArrayList<String> subject = new ArrayList<String>();
	
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
			
			return lastName;
		}
	
	public String getAMM() {
		
		return AMM;
	}
	
	public String getSubject() {
		
		return subject.toString();
	}
		
	public void setFirstName(String x) {
		
		firstName = x;
	}
	
	public void setLaststName(String y) {
			
			lastName = y;
		}
	
	public void setAMM(String z) {
			
			AMM = z;
		}
	
	public void setSubject(String v) {
		
		subject.add(v);
	}
		

	public void printInfo() {
		System.out.println("To onoma tou mathiti einai "+this.getFirstName());
		System.out.println("To epitheto tou mathiti einai "+this.getLastName());
		System.out.println("Me AMM "+this.getAMM());
		System.out.println("kai pernei meros sta mathimata "+this.getSubject());
		
	}
	
	
}
