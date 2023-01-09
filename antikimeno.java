public class Subject {
	
	private String subCode; // Subject Code
	private String subDesc; // Subject Description
	private String classroom; 
	
	public String getSubCode() {
		
		return subCode;
	}
	
	public String getSubDesc() {
		
		return subDesc;
	}
	
	public String getClassroom() {
		
		return classroom;
	}
	
	public void setSubCode(String x) {
		
		subCode = x;
	}
	
	public void setSubDesc(String y) {
		
		subDesc = y;
	}
	
	public void setClassroom(String z) {
		
		classroom = z;
	}
	
	public void printInfo() {
		System.out.println("Mathima "+this.getSubDesc());
		System.out.println("Me kodiko mathimatos "+this.getSubCode());
		System.out.println("kai didasketai stin taksi "+this.getClassroom());
	}

}
