class EmployeeDetails {
    private int EmpId;
    private String EmpName;
    private String Department;
    private double salary;
    public EmployeeDetails(int EmpId,String EmpName,String Department,double salary)
    {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Department = Department;
        this.salary = salary;
    }
    //getter and setter methods
    public int getEmpId() {
        return EmpId;
    }
    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String Department) {
        this.Department = Department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //method for displaying details
    public void displayDetails(){
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
        System.out.println("Department: " + Department);
        System.out.println("Salary: $" + salary);
        System.out.println("_________________________________");
    }
    public double AnnualSalary(double salary)
    {
        return salary * 12;
    }

    //salary increment
    public void incrementSalary(double percentage)
    {
        if(percentage>0)
        {
            double incrementAmount = salary * (percentage/100);
            salary += incrementAmount;
            System.out.println(EmpName+" received a raise of " + percentage + "%.");
            System.out.println("__________________________________");
        }
        else
        {
            System.out.println("Invalid percentage. Please enter a positive value.");
        }
    }
}

//Main class to test the EmployeeDetails class
public class EmployeeMain{
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails(1, "John Doe", "Sales", 50000);
        EmployeeDetails emp2 = new EmployeeDetails(2, "Jane Smith", "Marketing", 60000);

        emp1.displayDetails();
        emp2.displayDetails();

        System.out.println(emp1.getEmpName()+"'s Annual Salary: $" + emp1.AnnualSalary(emp1.getSalary()));
        System.out.println(emp2.getEmpName()+"'s Annual Salary: $" + emp2.AnnualSalary(emp2.getSalary()));
        System.out.println("______________________________________");

        emp1.incrementSalary(10);
        emp2.incrementSalary(15);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
