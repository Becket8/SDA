package pl.java.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachPlayground {
    protected List<Employee> emp = new ArrayList<>();

    public ForEachPlayground() {
        Employee ja = new Employee("ja", "ja", 12, 1000.0);
        Employee ty = new Employee("ty", "ty", 14, 1100.0);
        Employee on = new Employee("on", "on", 16, 1200.0);
        Employee ona = new Employee("ona", "ona", 18, 1300.0);
        Employee ono = new Employee("ono", "ono", 20, 1400.0);
        Employee my = new Employee("my", "my", 22, 5000.0);


        emp.add(ja);
        emp.add(ty);
        emp.add(on);
        emp.add(ona);
        emp.add(ono);
        emp.add(my);

    }


    public void printAll() {

        emp.forEach(employee -> System.out.println(employee.getAge()));
    }

    public void printReachestOne() {

        emp.forEach(employee -> {
            if (employee.getSalary() > 2500)
                System.out.println(employee);
        });

    }

    public void sumAll() {
        final int[] count = {0};
        emp.forEach(employee -> {

            if (employee.getSalary() > 1200)
                count[0]++;

        });
        System.out.println(count[0]);
    }

    public long streamsFilter(double salary) {
        long count = emp.stream().filter(employee -> employee.getSalary() > salary).count();
        return count;
    }

    public List<Employee> getEmployeesWithSalary(double salary) {
        List<Employee> result = emp.stream()
                .filter(employee -> employee.getSalary() > salary)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    return result;
    }





}
