import java.util.*;

public class Main {


    // javascript ex: let firstName = "Joe"

    String firstName = "Joe";

    // Primitive Types

    char aLetter = 'a'; // A single character in single quotes
    boolean isLogged = false; // Straightforward

    int aWholeNumber = 42; // whole number (integer)
    double numberWithDecimal = 3.45; // similar to float (most common)

    // Non-Primitive Types (kind of important to know difference, some structures require this)

    String aNewName = "Bob";
    Double aNewNum = 54.25;
    Integer aNewWholeNum = 12;
    Boolean isLoggedOut = true;

    // converting aNewWholeNum to double
    Double anotherNum = (double) aNewWholeNum;


    // privacy (you have to indicate the level of privacy a variable/function(method) has
    // kind of like scope

    public String lastName = "Jobless";
    // person.lastName (you can access outside class)

    private String middleName = "Homeless";
    // not accessible (only accessible here)


    // final (the word)

    // const = final
    private final String DOB = "01/24/1924";
    // this is non-changeable (const)

    // doesn't have to be private
    public final String firstPetName = "Beau";


    // make a function that takes an integer and returns an array of integers of prime numbers between 1 and that number
    // ex: 10 -> [2, 3, 5, 7]

    // Function declarations


    // Function declarations

    // javascript: function myFunc() {console.log('hello')}

    // public = accessible outside // String (what's being returned, cannot be different)
    public String getFullName() {
        // this is similar to JS
        return firstName + middleName + lastName;
    }

    // void (nothing is being returned)
    // indicate type with prefix
    public void updateDatabase(double cashAmount) {
        // you can access cashAmount here provided
    }

    // main function  shortcut: Ctrl J + "main"

    public static void main(String[] args) {
        // a class is considered a type
        // bobRoss is a "Person" type
        // uses Person.java file

        // this is using constructor
        Person bobRoss = new Person("Bob", "Ross", "Joe");

        // this is non constructor way
        /*bobRoss.firstName = "Bob";
        bobRoss.lastName = "Ross";
        bobRoss.middleName = "Joe";*/

        bobRoss.getFullName();
        // you cannot use Person.sayHi() (because it doesn't exist yet/not static)
        // you have to use bobRoss

        String bobsFirst = bobRoss.firstName;

        // to use Person.sayHi() it has to be "static"
        // static sayHi()
        // it doesn't rely on it being created to be used
        Person.sayHi();

        // gets the string context of a class
        bobRoss.toString();
        // it will default to use the above
        System.out.println(bobRoss);
        // the default toString looks like Person@afnj34 (area of memory)


        // Array example:
        String[] names = {"Bob", "Joe", "Rick", "Alex"};
        // you cannot change length now

        // example to change existing string or to add to empty value
        names[2] = "John";

        // this is telling it how many numbers are going to be used
        int[] ages = new int[20];


        // Array Lists

        ArrayList<String> students = new ArrayList<>();

        // example of adding
        students.add("Harry");
        students.add("Joey");
        students.add("Bobby");
        // this saves order it was put in (this is 0 index)
        students.get(1);
        System.out.println(students.get(1));


        // length vs size
        // string = length
        bobRoss.toString().length();

        // collections = use size
        students.size();


        // Hashmaps == JS objects
        // JS ex: let person = {name: "Joe", age: 32}

        // key val pair
        // hashmap has to use objects
        // primitives are not objects
        HashMap<String, Integer> studentAges = new HashMap<String, Integer>();
        studentAges.put("Fred", 21);
        studentAges.put("Ash", 32);
        // {key: value}

        // you have to use the key to get value (this auto converts to prims)
        int fredsAge = studentAges.get("Fred");

        // if you want multiple key values, but use class (its easier)

        HashMap<Integer, Person> studentAttendance = new HashMap<Integer, Person>();

        // this is now a collection of people denoted by numbers
        studentAttendance.put(13451, bobRoss);



        // loops

        // do-while and while-do are almost identical to JS

        // for loop (ex)

        for (int i = 0; i <= students.size(); i++) {
            System.out.println("Student #:" + i);
        }

        // for each
        // : = in/of names
        for (String name : names) {
            System.out.println(name);
        }


        // iterators
        // when we need to move arraylist or hashmap
        // arraylist has a native iterator method
        // iterator is now called "it"
        Iterator<String> it = students.iterator();

        // classic use
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // conditionals

        // identical to JS
        // there is no ===, Java already has types!
        if (2 == 2) {
            System.out.println("It's two!");
        }

        // this is: bobRoss.firstName == "Bob"
        if (Objects.equals(bobRoss.firstName, "Bob")) {
            System.out.println("Hello bob!");
        }

        // console in/out

        System.out.println("Hello World!");


        // taking input from user

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = input.nextLine();

        // everything inputted from user is string
        // nextInt will get an integer from user
        System.out.println("Please enter your age:");
        int userAge = input.nextInt();
        // nextDouble, etc


    }


}