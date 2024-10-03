public class TutorialWeek02 {
    public static  void  main(String[]args){


        Person person1 = new Person("Ben");
        person1.displayName();

        Person person2 =  new Person("Dilshan");
        person2.setSurname("Hewa");
        person2.setAge(21);

        Person person3 = new Person("Thisara");
        person3.setSurname("Neelawala");
        person3.setAge(22);

        Person person4 = new Person("Pramudith");
        person4.setSurname("Kothalawala");
        person4.setAge(22);

        person2.displayName();
        person2.displaySurname();
        person2.displayAge();

        person3.displayName();
        person3.displaySurname();
        person3.displayAge();

        person4.displayName();
        person4.displaySurname();
        person4.displayAge();






    }
}
