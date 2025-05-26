class GeoShape{
    public int area(int l){
        return l*l;
    }
      public int area(int l,int b){
        return l*b;
    
}
      public double area(double r){
        return Math.PI*r*r;
    
}

}

public class MethodOverLoadingDemo {
    public static void main(String[] args) {
        GeoShape sp = new GeoShape();
        System.out.println("area od sqare="+sp.area(10));
         System.out.println("area od sqare="+sp.area(10,8));
          System.out.println("area od sqare="+sp.area(6.67));
    }
}
