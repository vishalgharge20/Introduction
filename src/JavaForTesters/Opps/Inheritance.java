package JavaForTesters.Opps;

public class Inheritance {

    public static Employee e3 = new Employee();
    public static Employee e4 = new Employee();

    public static void main(String[] args) {

        e3.setEmployeeID(003);
        e3.setTitle("QA");
        e3.setName("p3");
        e3.setGender("M");
        e3.setAge(25);

        e4.setEmployeeID(004);
        e4.setTitle("Dev");
        e4.setName("p4");
        e4.setGender("F");
        e4.setAge(30);

        employeeDetails(e3);
    }

    public static void employeeDetails(Employee employee){
        System.out.println("Employee Details for "+ employee.getName());
        System.out.println("Name: "+ employee.getName());
        System.out.println("Title: "+ employee.getTitle());
        System.out.println("Employee id: "+ employee.getEmployeeID());
        System.out.println("Gender: "+ employee.getGender());
        System.out.println("Age: "+ employee.getAge());
    }
}