class Qualification{
String qualName;
String university;
String institute;
float cgpa;
Qualification(){
	qualName = "";
	university = "";
	institute = "";
	cgpa = 0.0f;
}
Qualification(String qualName ,String university ,String institute ,float cgpa){
	this.qualName = qualName;
	this.university = university;
	this.institute = institute;
	this.cgpa = cgpa;
}
void DisplayQual(){
		System.out.println("Qualification name : "+qualName);
		System.out.println("university :"+university);
		System.out.println("institute :"+institute);
		System.out.println("cgpa : "+cgpa);
	}
}