import java.util.*;
class EmployeeTest1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int num=scan.nextInt();
		Employee1 employees[]=new Employee1[num];
		int i;
		for (i=0;i<num;i++){
			employees[i] = new Employee1();
			System.out.println("Enter the name of Employee:");
			employees[i].name = scan.nextLine();
			if (i==0) scan.nextLine();
			System.out.println("Enter the Year of Joining:");
			employees[i].yearOfJoining = scan.nextInt();
		}
		Address address[]=new Address[num];
		int n;
		for (n=0;n<num;n++){
			address[n] = new Address();
			System.out.println("Enter the First line of Address:");
			address[n].firstLine = scan.nextLine();
			if (n==0) scan.nextLine();
			System.out.println("Enter the Second line of Address:");
			address[n].secondLine = scan.nextLine();
			System.out.println("Enter the Pincode of Address:");
			address[n].pinCode = scan.nextInt();
		}
		System.out.println("Name\t\tYear\t\tAddress");
		for (i=0;i<num;i++)
		{
			employees[i].displayInfo();
		}
		for (n=0;n<num;n++){
			address[n].displayAddress();
		}
	}
}