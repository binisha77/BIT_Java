class Person1{
    public String name;
    public String address;
    public Person1(){
        name=address="";
    }
    
    Person1(String n, String a){
        name=n;
        address =a;
        
    }
}
class Employe extends Person1{
    public int eid;
    public int salary;
    public Employe(){
        super();
        eid=salary=0;
    }
    public Employe(String n, String a,int id,int sal){
        super(n,a);
        eid=id;
        salary= sal;
    }
    public void display(){
        System.out.println("Name:" +name);
        System.out.println("address: "+ address);
        System.out.println("Salary: " +salary);
        System.out.println("Eid: "+ eid);
    }
}
class Manager extends Employe {
    public int expYear;
    public String quafl;
    public Manager(){
        super();
        expYear=0;
        quafl="";
        
        
    }
    public Manager(String n ,String a, int id, int sal,int exp,String q){
        super(n,a,id,sal);
        expYear =exp;
        quafl=q;
    }
        public void display(){
            super.display();
        System.out.println("No of exp year ="+ expYear);
        System.out.println("Qualification :"+quafl);
    }
}

public class SingleInheritancedemo {
    public static void main(String[] args) {
        Manager e = new Manager("Binisha", "kathmandu", 1000, 111, 2, "bachelors");
        System.out.println("Manager details");
        e.display();
    }
 
}
