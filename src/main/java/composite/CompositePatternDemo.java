package composite;

import java.util.List;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);
        Employee cleanLady = new Employee("Alice", "Clean", 10000);


        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        clerk1.add(cleanLady);

        System.out.println(findByName(CEO, "Richard"));

    }

    public static Employee findByName(Employee employee, String name) {
        if (employee.getName().equalsIgnoreCase(name)) {
            return employee;
        }

        List<Employee> sub = employee.getSubordinates();
        Employee resto = null;

        for (int i = 0; resto == null && i < sub.size(); i++) {
            resto = findByName(sub.get(i), name);
        }

        return resto;

    }

}