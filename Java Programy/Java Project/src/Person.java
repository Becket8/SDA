/**
 *@author Filip
 * @since 1.2
 */
public class Person {
    private  String name;
    private  String surname;
    private  int age;

    /**
     * No args constructor to create new Person
     */

    public Person(){

    }

    /**
     * All args constructor
     * @param name
     * @param surname
     * @param age
     */
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
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
    /**
     * returns void
     * @throws Exception
     * @return
     */

    public void setAge(int age) throws Exception {
        if(age<0){
        throw new Exception();
    }
        this.age = age;
    }


    public static void main(String[] args) throws Exception {
        Person emploee = new Person();
        emploee.setAge(14);
        for(int i = 0; i<60;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
