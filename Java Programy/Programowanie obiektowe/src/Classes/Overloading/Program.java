package Classes.Overloading;


public class Program {
    public static void main(String[] args) {
Student studentInformatyki = new Student();
        Student studentPrawa = new Student("Jan","Kowalski");
        System.out.println(studentPrawa.getName());

        Author Mickiewicz = new Author("Adam","Mickiewicz",25);
        System.out.println(Mickiewicz.getName());
        Rectangle r = new Rectangle(2,3);
        System.out.println("Kwadrat boki: "+ r.getA() +" "+ r.getB());

        MathHelper helper = new MathHelper();
        int summary = helper.summary(5,15);
        System.out.println("Wynik to" + summary);
    }
}
