package window;
import java.io.*;

public class FileTestByte {
    public static void main(String[] args) {
        byte a[]="我是\n255周永豪".getBytes();
        byte[] b="\n".getBytes();
        try{
            FileOutputStream out=new FileOutputStream("happy.txt");
            out.write(a);
            out.write(b);
            //out.write(b,0,b.length);
            out.close();
        }
        catch(IOException exc){
            System.out.println("Error"+exc);
        }
    }
}
