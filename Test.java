public class Test {
    public static void main(String[] args) {
        // 1) Prepare an Object of Emp() and Initialize a Variable
        Emp emp1 = new Emp(); 
        emp1.setId(548); 
        emp1.setName("vijay");
        emp1.setSalary(50000.0);
        emp1.setPhone(76749393L);

        // 2) Print Values using Getters()
        System.out.println("Employee Details using Getters:");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Phone: " + emp1.getPhone());
        System.out.println();

        
        Emp emp2 = new Emp(666, "fulka", 60000.0, 9876543210L); 

     
        System.out.println("Employee Details using toString():");
        System.out.println(emp2.toString());
    }
}

