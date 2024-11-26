public class Main {
    public static void main(String[] args) {
        Employee  obj0=new Employee("Ayodeji","Ade","swe",3.87);
        Employee obj1 = new Employee("Hemalatha", "Chandrasekar", "software developer",8000.00);
        Employee obj2 = new Employee("Jyothi", "Devarapalli", "software developer",6000.00);
        Employee obj3 = new Employee("DeJean", "Williams", "software developer",5000.00);
        Employee obj4 = new Employee("Grace", "li", "software developer",5000.00);
        Employee obj5 = new Employee("Rana", "i ", "software developer",5000.00);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj0);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj3));
        System.out.println(obj1.hashCode());

        System.out.println(obj1.getFirstName());
    }
}