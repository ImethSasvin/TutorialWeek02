public class Person {

    private String name;
    private String surname;
    private int age;


    public Person(String n){
        name = n;
    }

    public void displayName(){
        System.out.println(name);
    }

    public void displayAge(){
        System.out.println(age);
    }

    public void displaySurname() {
        System.out.println(surname);
    }


    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int setAge(){
        return age;
    }

}
