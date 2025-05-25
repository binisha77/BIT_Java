class A{
    public A(){
        System.out.println("class A");
    }
}

class B extends A{
    public B(){
        System.out.println("class B");
    }   
    }
    class C extends B{
        public C(){
            System.out.println("class C");
        }
    }
    
    
    
    


public class ConstructorCallInheritance {
    public static void main(String[] args) {
       C c =new C();
    
}
}
