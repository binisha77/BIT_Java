


class MTable {
    synchronized public void printTable(int n){
        System.out.println("Table of" + n);
        for(int i=1;i<=10;i++)
           System.out.println(n*i +" ");
    }
}
class Thread1 extends Thread {
    MTable t;
    public Thread1(MTable t){
            this.t = t;
}
    public void run(){
        t.printTable(11);
    }
            
}

class Thread2 extends Thread {
    MTable t;
    public Thread2(MTable t){
            this.t = t;
}
    public void run(){
        t.printTable(12);
    }
            
}
class Thread3 extends Thread {
    MTable t;
    public Thread3(MTable t){
            this.t = t;
}
    public void run(){
        t.printTable(13);
    }
            
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        MTable table = new  MTable();
        Thread1 t1 = new Thread1(table);
        Thread2 t2 = new Thread2(table);
        Thread3 t3 = new Thread3(table);
        t1.start();
        t2.start();
        t3.start();
    }
}
