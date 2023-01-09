public class Teacher {
	
	private String firstName;
	private String lastName;
	private String AMKA;
	private String subject;
	
	public String getFirstName() {
		
			return firstName;
		}
	
	public String getLastName() {
			
			return lastName;
		}
		
	public String getAMKA() {
		
			return AMKA;
		}
	
	public String getSubject() {
			
			return subject;
		}
		
	public void setFirstName(String x) {
		
			firstName = x;
		}
	
	public void setLaststName(String y) {
			
			lastName = y;
		}
	
	public void setAMKA(String z) {
			
			AMKA = z;
		}
	
	public void setSubject(String v) {
		
			subject = v;
		}

	public void printInfo() {
		System.out.println("To onoma tou kathigti einai "+this.getFirstName());
		System.out.println("To epitheto tou kathigiti einai "+this.getLastName());
		System.out.println("Me AMKA "+this.getAMKA());
		System.out.println("Didaskei "+this.getSubject());
	}
	
	
}
