package btth;

import btth.model.Developer;
import btth.model.Employee;
import btth.model.Manager;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("An", 2000, 500);
        Employee e2 = new Developer("Bình", 1500);

        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            System.out.println(e.getName() + " lương : " + e.getSalary());
        }
    }
}
