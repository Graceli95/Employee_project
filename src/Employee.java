public class Employee {
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

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

    public double weeklySalary() {
        return payRate * 40;

    }

    @Override
    public String toString() {
        return "firstName=" + firstName + " lastName=" + lastName + ", title=" + title + "payRate=" + payRate;
    }

    @Override
    public boolean equals(Object obj) {
        return firstName.equals(((Employee) obj).firstName)
                && lastName.equals(((Employee) obj).lastName)
                && title.equals(((Employee) obj).title);

    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + title.hashCode();
    }
}
