abstract class GShape{
    public int length;
    public int breadth;
    public abstract int area();
    
}
class Triangle extends GShape{
    public Triangle(int l, int h){
        length=l;
        breadth =h;
    } 
    public int area(){
        return length*breadth/2;
    }
}
class Rect extends GShape{
    public Rect(int l, int b){
        length=l;
        breadth=b;
    }
    
    public int area(){
        return length*breadth;
    }
}
class Square extends GShape{
    public Square(int l, int b){
        length=l;
        breadth=b;
    }
    
    public int area(){
        return length*breadth;
    }
}




public class AbstractCalssExample {
    public static void main(String[] args) {
        Square s = new Square(10,10);
        System.out.println("area of square "+s.area());
        Triangle t= new Triangle(10,8);
        System.out.println("area of triangle "+t.area());
         Rect r= new Rect(12,10);
        System.out.println("area of rectangle "+r.area());
        
    }
}
