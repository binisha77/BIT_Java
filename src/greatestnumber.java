import java.util.Scanner;
public class greatestnumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);{
            int a,b,c;
         
        System.out.println("enter first num");
        a=input.nextInt();
         System.out.println("enter second num");
        b=input.nextInt();
         System.out.println("enter third num");
        c=input.nextInt();
        if(a>b&&a>c)
             System.out.println(a+ " is largest");
        else if (b>a&&b>c)
            System.out.println(b+ " is largest");
        
            else
            System.out.println(c+ " is largest");
        
    }
}
}