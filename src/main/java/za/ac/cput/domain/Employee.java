package za.ac.cput.domain;

public class Employee {
    private String employeeNumber;
    private String firstName;
    private String lastName;

    // constructors
    Employee(){

    }
    Employee (String employeeNumber,String firstName,String lastName){
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //setters
    public void setEmployeeNumber(String employeeNumber){
        this.employeeNumber = employeeNumber;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //getters
    public String getEmployeeNumber(){
        return this.employeeNumber;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee Number: "+this.getEmployeeNumber()+
                "\t\tFirstName: "+this.getFirstName() +"\t\tLastName:"+this.getLastName();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("1", "John", "Doe");
        Employee e2 = new Employee("2D","Hilary","Hilary");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
