package Klasy.Company;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private int salary;


    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Podano ujemny wiek");

        } else
            this.age = age;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("Pensja nie moze byc ujemna");
        } else {
            this.salary = salary;
        }

    }

    public void describeEmploee() {
        System.out.println("Name: " + this.name + "\nSurname: " + this.surname + "\nAge: " + this.age);
    }
}
