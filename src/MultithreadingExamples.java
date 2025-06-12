class Days extends Thread {
   String day[] = {"sunday","monday","tuesday","wed","thus","fri","sat" };
   public void run(){
    for(int  i=0;i<day.length;i++){
    System.out.println(day[i]);
    try{
    Thread.sleep(1500);
    
}catch(InterruptedException e){
        System.out.println(e);
}
}
   }
}
class Months extends Thread{
  String month[] = {"Jan","Feb","Mar","Apr","May","June","july","Aug","Sep","oct","Nov","Dec" }  ;
      
  
  public void run(){
      for(int i=0;i<month.length;i++){
          try{
              Thread.sleep(2000);
               System.out.println(month[i]);
          }catch(InterruptedException e){
        System.out.println(e);
}
      }
         
                  
      }
  }

public class MultithreadingExamples {
    public static void main(String[] args) {
        Days d = new Days();
        Months m = new Months();
        d.start();
        m.start();
    }
   
}
