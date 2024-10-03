public class Person {
    private String name;
    private String surname;
    private int age;


    /*Constructor - Creating a new instance of Person*/

    public Person(String n){
        name= n;
    }


    //Setter for surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Setter for age
    public void setAge(int age){
        this.age = age;
    }

    //Getter for Surname
    public String getSurname(){
        return surname;
    }


    //Getter for age
    public int getAge() {
        return age;
    }

    //Method to get name
    public void displayName(){
        System.out.println(name);
    }
    public void displaySurname(){
        System.out.println(surname);
    }
    public void displayAge(){
        System.out.println(age);
    }
}
