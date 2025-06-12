

import java.awt.*;
import java.awt.event.*;
class SimpleInterest extends Frame implements ActionListener {
    Label p,t,r,i;
    TextField t1,t2,t3,t4;
    Button ComputerInt, reset;
    public SimpleInterest(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        p = new Label("Enter Principal");
        t1 = new TextField(30);
        add(p);
        add(t1);
        t = new Label("Enter Time");
        t2 = new TextField(40);
        add(t);
        add(t2);
        r= new Label("Enter rate");
        t3 = new TextField(40);
        add(r);
        add(t3);
        i= new Label("simple intrest");
        t4 = new TextField(40);
        add(i);
        add(t4);
        
        ComputerInt  = new Button("Calculation Intrest");
        add(ComputerInt);
        reset = new Button("Reset");
        add(reset);
        
        reset.addActionListener(this);
        ComputerInt.addActionListener(this);
        
        
        
        
        
       
        setSize(500,500);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String s1,s2,s3;
        if(ae.getSource()==ComputerInt){
        s1 = t1.getText();
        s2 = t2.getText();
        s3  = t3.getText();
        int p,t,r,i;
        p= Integer.parseInt(s1);
        t= Integer.parseInt(s2);
        r= Integer.parseInt(s3);
        i=(p*t*r)/100;
        t4.setText(String.valueOf(i));
        }else{
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
            t4.setText("0");
            
        }
    }
}





public class MyGUIProgram {
    public static void main(String[] args) {
        new SimpleInterest();
    }
}
