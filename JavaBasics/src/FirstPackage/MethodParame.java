package FirstPackage;

public class MethodParame {
	
	
	public void login(String name, String lastname, String password)
	{
		
	System.out.println("Enter Name\t"+name);
	System.out.println("Enter Last name\t" +lastname);
	System.out.println("Enter Password\t" +password);
		
	}
	
	
	public static void main(String[] args) {
	
		MethodParame s1 = new MethodParame();
		s1.login("shoaib"," Muhammad", "sm1234");
		s1.login("rayan", "shoaib"," rs1234");
		s1.login("Fayzaan","Shoaib" ,"FS1234" );
	    
	}
	

}
