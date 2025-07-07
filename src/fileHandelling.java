


import java.io.*;
public class fileHandelling {
    public static void main(String[] args)throws IOException {
        
        //readfile
        FileReader fin = new FileReader("D:\\java\\hello.txt");
        int ch;
        while(true){
            ch =fin.read();
            if(ch==-1)break;
            System.out.print((char) ch);
            
        }
        fin.close();
        System.out.println(" reading end ");
        }
//        FileInputStream fin = new FileInputStream("C:\\Users\\Acer\\Documents\\NetBeansProjects\\BIT7java\\src\\fileHandelling.java");
//                int ch;
//                
//                FileOutputStream fout = new FileOutputStream("D:\\java\\myfile.java",true);
//        while(true){
//            ch = fin.read();
//            if(ch==-1)break;
//            fout.write(ch);
//            System.out.print((char)ch);
//        }
//        fin.close();
//         fout.close();
    }

