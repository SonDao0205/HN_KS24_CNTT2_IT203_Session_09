import java.util.ArrayList;

public class Bai5 {
    static class Employee{
        void calculateSalary(){};
    }

    static class OfficeEmployee extends Employee{
        @Override
        public void calculateSalary() {
            System.out.println("Office Calculate Salary");
        }
    }

    static class ProductionEmployee extends Employee{
        @Override
        public void calculateSalary() {
            System.out.println("Production Calculate Salary");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new OfficeEmployee();
        Employee emp2 = new OfficeEmployee();
        Employee emp3 = new ProductionEmployee();
        Employee emp4 = new ProductionEmployee();
        Employee emp5 = new OfficeEmployee();

        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(emp5);
        for(Employee e:emps){
            e.calculateSalary();
        }
    }
}
