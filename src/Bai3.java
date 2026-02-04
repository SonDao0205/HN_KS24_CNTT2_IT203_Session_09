public class Bai3 {
    static class Employee{
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    static class Manager extends Employee{
        String department;
        public Manager(String name, int salary, String department) {
            super(name, salary);
            this.department = department;
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager("nguyen van a",100000,"Quan ly");
        System.out.println(manager.name);
        System.out.println(manager.salary);
        System.out.println(manager.department);

    }
}
