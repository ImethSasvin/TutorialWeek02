public class Main {
    public static void main(String[] args) {
        Person person1 =  new Person("Ben");
        person1.setAge(18);
        person1.setSurname("Hawkins");

        person1.displayName();
        person1.displayAge();
        person1.displaySurname();

    }
}