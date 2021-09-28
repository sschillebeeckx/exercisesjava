import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

    private String firstName;
    private int age;
    private static int retirementAge=65;
    private boolean married;

    private Address address;

    private List<Hobby> hobbyList = new ArrayList<>();



    public Person() {
        System.out.println("person created");
    }

    public Person(String firstName, int age){
       this();
        this.firstName=firstName;
        this.setAge(age);
    }

    public Person(String firstName, int age, boolean married){
        this(firstName, age);
        this.married=married;
    }

    public Person(String firstName, int age, boolean married, Address address){
        this(firstName, age,married);
        this.address=address;
    }


    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }

    public static int getRetirementAge() { return retirementAge; }

    public static void setRetirementAge(int retirementAge) { Person.retirementAge = retirementAge; }

    public boolean isMarried() { return married; }

    public void setMarried(boolean married) { this.married = married; }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void addHobby(Hobby hobby){
        hobbyList.add(hobby);
    }

    public void removeHobby(Hobby hobby){
        hobbyList.remove(hobby);
    }


    @Override
    public String toString() {
        return "I am " + this.firstName + " and I am " + this.age + " years old.";
    }

    public void tellInfo(){
        System.out.println("I am " + this.firstName + " and I am " + this.age + " years old.");
    }

    public void tellInfo(String sentence){
        System.out.println(sentence);
        this.tellInfo();
    }

     int calculateTimeToGoUntilRetirement(){
        return retirementAge - age;
    }

    public void readBook(Book b){
        System.out.println("reading book");
    }






}
