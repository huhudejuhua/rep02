package window;

import java.io.*;


public class FileTest {
    public static void main(String[] args) {
        try{
            File file=new File("test.txt");      //打开文件
            FileWriter out=new FileWriter(file);
            BufferedWriter out2=new BufferedWriter(out);//缓冲流
            out2.write("new line");
            out2.newLine();
            out2.write("new line2");
            out2.close();
            //char a[]="啦啦啦我是卖报的小行家".toCharArray();
            //FileWriter out=new FileWriter(file);
            //out.write(a,0,a.length);
            //out.close();
            FileReader in=new FileReader(file);     //在文件上创建文件字符流
            BufferedReader in2=new BufferedReader(in);//随机流，将其套装在文件字符流上面
            String s=null;
            while((s=in2.readLine())!=null){        //逐行读取
                System.out.println(s);
            }
            //StringBuffer s=new StringBuffer();      //创建个增加的字符串类型
            //char tom[]=new char[10];                //用于接收读到字符的字符数组
            //int n=-1;                               //标志符号,判断文件是否读到
            //while((n=in.read(tom,0,10))!=-1) {    //读文件，一次读10个字符
             //   String temp=new String(tom,0,n);        //n为实际读到的，而不是10
             //   s.append(temp);                                  //读到的文件添加到s中
            //}
            in2.close();
            in.close();//关闭文件字符流
            out.close();
            //System.out.println(new String(s));      //答应读到的文件
        }
        catch (IOException exc){
            System.out.println(exc.toString());
        }
    }
}
