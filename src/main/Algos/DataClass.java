package Algos;

public class DataClass {
    private String lastName;
    private String firstName;
    private int age;

    public DataClass(String last, String first, int a) throws IllegalArgumentException
    {
        try
        {
            lastName = last;
            firstName = first;
            age = a;
        }
        catch (ArrayStoreException e2)
        {
            System.out.print("The entry you want to register has the wrong type");
        }
    }

    public void displayPerson()
    {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    public String getLast()
    { return lastName; }
}
