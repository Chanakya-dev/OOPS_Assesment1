public class Test{
// 1)Prepare an Object of Emp() and Initialize a Variable
// 2)Print Values using Getters()
// 3)Prepare an Object of Emp() Initialize it through Args()Constructor
// 4)Print Values by using toString();

public class Main {
    public static void main(String[] args) {
        // 1. Create an Emp object using the default constructor and initialize it
        Emp emp1 = new Emp();
        // Set values using setters
        emp1.setId(1);
        emp1.setName("AB");
        emp1.setSalary(75000.0);
        emp1.setDepartment("Software");
        
        // Print values using getters
        System.out.println("Employee 1 Details:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Department: " + emp1.getDepartment());

        

        // 2. Create an Emp object using the parameterized constructor
        Emp emp2 = new Emp();

        emp2.setId(1);
        emp2.setName("AB");
        emp2.setSalary(75000.0);
        emp2.setDepartment("talecaller");
        
        // Print values using getters
        System.out.println("Employee 2 Details:");
        System.out.println("ID: " + emp2.getId());
        System.out.println("Name: " + emp2.getName());
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Department: " + emp2.getDepartment());

        
        // Print values using toString() method
        System.out.println("\nEmployee 1 Details:");
        System.out.println(emp1.toString());
        System.out.println("\nEmployee 2 Details:");
        System.out.println(emp2.toString());
    }
}

  
}
