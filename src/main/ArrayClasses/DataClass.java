package ArrayClasses;

public class DataClass {
    private String lastName;
    private String firstName;
    private int age;

    public DataClass(String last, String first, int a) throws IllegalArgumentException,ArrayStoreException
    {
        lastName = last;
        firstName = first;
        age = Math.abs(a);
    }

    public void displayPerson()
    {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLast()
    { return lastName; }


    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}
