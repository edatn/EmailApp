package emailapp;

import java.util.Scanner;

public class Email {
  
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int  mailBoxCapacity=400;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String companySuffix="aeycompany.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName= firstName;	
		this.lastName= lastName;

		//return the department
		this.department=setDepartment();
	
		
		//call a random password
		this.password=randomPassword(defaultPasswordLength);
	    System.out.println("your password is :" + this.password);
	
	    //combine elements to generate  email
		email= firstName.toLowerCase() +"." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	} 
	
	//ask the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for sales\n2 for development \n3 for Accounting \n0 for none \nEnter depertment code:  ");
	    Scanner in =new Scanner(System.in);
	    int depChoice =in.nextInt();
	    if (depChoice==1) {return "sales";}
	    else if (depChoice==2) {return "dev";}
	    else if (depChoice==3) {return "acct";}
	    else {return "";}
	}
	
	// generate a random password
	private String randomPassword(int length) {
		String passwordSet = "abcdefsgyehjduejdkodledoekdlek20212&";
	    char[] password = new  char[length];
	    for (int i=0; i<length; i++) {
	    	int rand =(int)(Math.random() * passwordSet.length());
	    	password[i] =passwordSet.charAt(rand);
	    }
	    return new String (password);
	}
	
	
	// set the mailbox  capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity= capacity;
	}
	
	// set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail=altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password= password;
	}

	
	public String getPassword() {
		return password;
	}
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	

	public String showInfo() {
	   return "DISPLAY NAME : " + firstName + " " + lastName +
			   "\n COMPANT EMAIL: " + email +
			   "\n MAILBOX CAPACITY: "  + mailBoxCapacity + "mb";
		
	}
	
	
	
	
}
