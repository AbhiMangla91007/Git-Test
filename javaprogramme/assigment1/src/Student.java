class Student{
String firstName;
String lastName;
Qualification qual[];
Adress addr ;
Project project[];
String eMail;
String contactNo;
String skills[];
Student(){
	firstName = "";
	lastName = "";
	addr = null;
	qual = null;
	project = null ;
	eMail = "";
	contactNo = "";
	skills = null;
}
Student(String firstName, String lastName,Qualification qual[], Adress addr,Project project[],String eMail,String contactNo,String skills[] ){
	this.firstName = firstName;
    this.lastName = lastName;
	this.addr = addr;
	this.qual = qual;
	this.project = project;
	this.eMail = eMail;
	this.contactNo = contactNo;
	this.skills =skills;
}
void DisplayStudent(){
	System.out.println("firstName : "+firstName);
	System.out.println("lastName :"+lastName);
	addr.DisplayAddress();
	for(int j=0;j<skills.length;j++){
	System.out.println("Skills :"+skills[j]);
	}
		for(int i=0;i<qual.length;i++){
		qual[i].DisplayQual();
	}
	for(int k=0;k<project.length;k++){
		project[k].DisplayProject();
	}
	System.out.println("eMail :"+eMail);
	System.out.println("contactNo :"+contactNo);
	}
}