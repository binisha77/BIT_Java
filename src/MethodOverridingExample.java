
class AA{
public AA(){
    System.out.println("AA class");
}
}
class BB extends AA{
public BB(){
    System.out.println("BB class");
}
}

class CC extends BB{
public CC(){
    System.out.println("CC class");
}
}



public class MethodOverridingExample {
    public static void main(String[] args) {
        CC c = new CC();
    }
}
