import java.util.*;
class HeartRateTest
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        HeartRate a[] = new HeartRate[2];
        for (int i=0;i<2;i++)
        {
            a[i] = new HeartRate();
            System.out.println("Enter the First name:");
            a[i].firstName = scan.nextLine();
            if (i==0) scan.nextLine();
            System.out.println("Enter the Last name:");
            a[i].lastName = scan.nextLine();
            System.out.println("Enter the day of DOB:");
            scan.nextLine();
            a[i].dob.days = scan.nextInt();
            System.out.println("Enter the month of DOB:");
            scan.nextLine();
            a[i].dob.month = scan.nextInt();
            System.out.println("Enter the year of DOB:");
            scan.nextLine();
            a[i].dob.year = scan.nextInt();
        }
        System.out.println("\t\tFirstName\t\tLastName\t\tDoB\t\tMaximumHeartRate\t\tTargetHeartRate(Min)\t\tTargetHeartRate(Max)");
        System.out.print("Person-1:\t\t");
        double ageInYears=a[0].age();
        double maxHR = a[0].maxHRate();
        double targetHRMax=a[0].targetMax();
        double targetHRMin=a[0].targetMin();
        System.out.println(a[0].firstName+"\t\t"+a[0].lastName+"\t\t"+a[0].DoB()+"\t\t\t"+maxHR+"\t\t"+targetHRMax+"\t\t\t\t"+targetHRMin);
        System.out.print("Person-2:\t\t");
        ageInYears=a[1].age();
        maxHR = a[1].maxHRate();
        targetHRMax=a[1].targetMax();
        targetHRMin=a[1].targetMin();
        System.out.println(a[1].firstName+"\t\t"+a[1].lastName+"\t\t"+a[1].DoB()+"\t\t\t"+maxHR+"\t\t"+targetHRMax+"\t\t\t\t"+targetHRMin);    
    }
}