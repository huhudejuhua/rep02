package window;

import java.io.IOException;
import java.io.RandomAccessFile;

public class FileTestRandomRecode {
    public static void main(String[] args) {
        RandomAccessFile in=null;
        try{
            in=new RandomAccessFile("FileTest.java","rw");
            long length=in.length();
            long position=0;
            in.seek(0);
            while(position<length){
                String str=in.readLine();
                byte a[]=str.getBytes("iso-8859-1");//重新编码
                str=new String(a);
                position=in.getFilePointer();//得到当前位置（读取后的位置）
                System.out.println(str);
            }
        }
        catch (IOException exc){}
    }
}
