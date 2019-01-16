class DateOfBirth
{
    int days;
    int month;
    int year;
}
class HeartRate
{
    String firstName;
    String lastName;
    DateOfBirth dob = new DateOfBirth();
    
    HeartRate(String fName,String lName,int day,int month,int year)
    {
        firstName=fName;
        lastName=lName;
        dob.days=day;
        dob.month=month;
        dob.year=year;
    }

    double age()
    {
        return (2019-dob.year);
    }
    double maxHRate()
    {
        return (220-this.age());
    }
    double targetMax()
    {
        return (0.5*this.maxHRate());
    }
    double targetMin()
    {
        return (0.85*this.maxHRate());
    }
    String DoB()
    {
        return (this.dob.days+"/"+this.dob.month+"/"+this.dob.year);
    }
}