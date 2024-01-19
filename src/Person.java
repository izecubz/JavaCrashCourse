public class Person {

    public String firstName;
    public String lastName;
    public String middleName;
    private int userID;

    public String getFullName() {
        return firstName + middleName + lastName;
    }

    // doesn't need to be initialized to be used
    // ex: no need for Person bobRoss = new Person("Bob", "Ross", "Joe");
    public static String sayHi() {
        return "Hi!";
    }

    // shortcut: alt + insert then click constructor
    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    // shortcut: alt + insert then click toString
    // each class has a "default toString"
    // this overrides the default.
    @Override
    public String toString() {
        return "This person's name is " + this.firstName + " " + this.lastName + ".";
    }
}
