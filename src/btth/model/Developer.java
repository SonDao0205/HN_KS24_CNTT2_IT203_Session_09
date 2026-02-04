package btth.model;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        // Giả sử Developer được thêm 10% lương OT cố định
        return salary * 1.1;
    }
}