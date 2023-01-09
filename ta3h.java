public class Classroom {
	
	private String classCode; // classroom code
	private String classDesc; // classroom description
	
	public String getClassCode() {
		
		return classCode;
	}
	
	public String getClassDesc() {
		
		return classDesc;
	}
	
	public void setClassCode(String x) {
		
		classCode = x;
	}
	
	public void setClassDesc(String y) {
		
		classDesc = y;
	}
	
	public void printInfo() {
		System.out.println("Taksi "+this.getClassDesc());
		System.out.println("Me kodoko taksis "+this.getClassCode());
	}

}
