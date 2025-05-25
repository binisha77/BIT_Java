class Person {
    public String name;
    public String address;

    public Person() {
        name = "";
        address = "";
    }

    public Person(String n, String a) {
        name = n;
        address = a;
    }
}

class Employee extends Person {
    public int eid;
    public int salary;

    public Employee() {
        super();
        eid = 0;
        salary = 0;
    }

    public Employee(String n, String a, int id, int s) {
        super(n, a); 
        eid = id;
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Eid: " + eid);
        System.out.println("Salary: " + salary);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Employee emp = new Employee("sovitha", "Bhaktapur", 1011, 125000);
        emp.display();
    }
}