class AA{
    public final void show(){
        System.out.println("hello world");  
    }
}
class BB extends AA{
 public void shows(){
    super.show();
        System.out.println("hello");  
    }


}


public class MethodOverrriding {
    public static void main(String[] args) {
        BB b = new BB();
        b.show();
    }
}
//final used for prevent inheritance