import java.util.Objects;

/**
 * Step 1: Set Up the Employee Class
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;


    /**
     *Step 2: Create a Parameterized Constructor
     */
    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    /**
     * Getters and setters allow controlled access to private fields, ensuring encapsulation.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public double getPayRate() {
        return payRate;
    }

    public double caculateWeeklySalary() {
        return payRate * 40;

    }

    /**
     * Override toString Method
     *The toString method is used to display the object’s data in a readable format.
     */
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", payRate=" + payRate + "]";
    }


/**
 * Override equals Method
 *  check if two obj is the same obj
 *  Override the equals method to compare two employees based on their firstName, lastName, and title.
 * The equals method ensures logical equality, allowing you to check if two employees have the same attributes.
 */

//boolean result = obj7.equals(obj5);

//    @Override
//
//    public boolean equals(Object obj) {
////        to ensure obj is an employee
//        if (obj == null || getClass() != obj.getClass())
//            return false;
////        cast object to employee
//        Employee employee = (Employee) obj;
//        return firstName.equals(employee.firstName)
//                && lastName.equals(((Employee) obj).lastName)
//                && title.equals(((Employee) obj).title);
//
//    }

//boolean result = obj7.equals(obj5);

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(this.payRate, employee.payRate) == 0 && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.title, employee.title);
    }

    /**
     * Override hashCode Method
     * Task:
     * Override the hashCode method to generate a hash code based on the same fields used in equals.
     * The hashCode method ensures that logically equal objects have the same hash code, which is important for collections like HashSet and HashMap.
     */
    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + title.hashCode();
    }
}
