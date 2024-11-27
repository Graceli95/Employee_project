public class Main {
    public static void main(String[] args) {

        Employee obj1 = new Employee("Hemalatha", "Chandrasekar", "software developer",8000.00);
        Employee obj2 = new Employee("Jyothi", "Devarapalli", "software developer",6000.00);
        Employee obj3 = new Employee("DeJean", "Williams", "software developer",5000.00);
//        Employee obj4 = new Employee("Grace", "li", "software developer",5000.00);
        Employee obj7 = new Employee("Rana", "i ", "software developer",5000.00);

        Employee obj5 = new Employee("Rana", "i ", "software developer",5000.00);
        Employee obj6 =new Employee("Ayodeji","Ade","software developer",5000.00);

        boolean result = obj7.equals(obj5);

        System.out.println(result);



        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj7);
        System.out.println(obj5);
        System.out.println(obj6);

        System.out.println(obj1.equals(obj2));

        System.out.println("the original first name " + obj3.getFirstName());
        obj3.setFirstName(obj1.getFirstName());//obj3 is Dejean, obj1 is hema
        System.out.println("new first name " + obj3.getFirstName());
        obj3.setLastName(obj1.getLastName());
        obj3.setTitle(obj1.getTitle());
        System.out.println("comparing obj1 to obj3 " + obj1.equals(obj3));

        System.out.println(obj1.hashCode());

        System.out.println(obj1.getFirstName());
    }
}