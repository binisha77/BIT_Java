

class Time1 {
    public int hr;
    public int min;
    public int sec;
    public Time1(){
        hr=min=sec=0;
    }
    public Time1(int h, int m, int s){
        hr= h;
        min=m;
        sec=s;
    }
    public void display(){
            System.out.println(hr + ":" +min + ":"+sec);
                
    }
    public Time1 add(Time1 t2){
        Time1 temp = new Time1();
        temp.sec = sec+t2.sec;
        temp.min = min+t2.min;
           temp.hr = hr+t2.hr;
           if(temp.sec>=60){
               temp.min++;
               temp.sec-=60;
               
           }
           if(temp.min>=60){
               temp.hr++;
               temp.min-=60;
           }
           return temp;
    
    }
}




public class Time {
    public static void main(String[] args) {
        Time1 t1 = new Time1(1,20,30);
         Time1 t2 = new Time1(1,40,50);
         Time1 
                 t3=t1.add(t2);
         t3.display();
    }
  
}
