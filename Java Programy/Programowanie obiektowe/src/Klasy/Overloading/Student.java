package Klasy.Overloading;

public class Student {
    private String name;
    private String subname;
    private int age;
    private int yearOfStudies;
    private int indexNumber;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
