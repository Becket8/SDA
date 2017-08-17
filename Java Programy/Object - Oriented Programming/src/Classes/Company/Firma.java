package Classes.Company;

public class Firma {
    private String name;
    private Employee[] pracownicy;
    private int numberOfEmployees;


    public Firma() {
        pracownicy = new Employee[10];
        numberOfEmployees = 0;
    }

    //Metoda ktora wszystkich wyswietli wszystkich pracownikow (zła)
    public void SpisPracownikowZle() {
        for (Employee i : pracownicy) {
            i.describeEmploee();
        }
    }

    //Poprawna wersja dodawania
    public void printEmploees() {
        if (numberOfEmployees == 0) {
            System.out.println("Liczba pracownikow wynosi 0");
        } else {

            for (int i = 0; i < numberOfEmployees; i++) {
                Employee emp = pracownicy[i];
                emp.describeEmploee();
            }

        }
    }

    //metoda dodawania pracownikow
    public void addEmployee(Employee employee) {
        pracownicy[numberOfEmployees] = employee;
        numberOfEmployees++;

    }

    public double coutAverageSalary() {
        int sum = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            sum += pracownicy[i].getSalary();
        }
        sum = sum / numberOfEmployees;
        System.out.println("Srednia pensja to: " + sum);
        return sum;

    }

    public double coutAverageAge() {
        int sum = 0;
        for (int i = 0; i < numberOfEmployees; i++) {
            sum += pracownicy[i].getAge();
        }
        sum = sum / numberOfEmployees;
        System.out.println("Srednia pensja to: " + sum);
        return sum;

    }


    public void getEmploeeWithHighestSalary() {
        int max = pracownicy[0].getSalary();
        for (int i = 0; i < numberOfEmployees; i++) {
            if (pracownicy[i].getSalary() > max) {
                max = pracownicy[i].getSalary();
            } else {


            }


        }
        System.out.println("Najwyzsza pensja to: " + max);

    }
}




//napisac metode ktora wyswietli wszystkich pracownikow
