package test4;

import java.awt.*;
import java.util.Scanner;

public class mistaketest1 {
    public static void main(String[] args) {
        try{
            Scanner scanner =new Scanner(System.in);
            System.out.println("请输入两个数：");
            double a=scanner.nextDouble();double b=scanner.nextDouble();
            //if(b==0){
               // throw new error0();
            //}
            double c=a/b;
            System.out.println("计算结果："+a);
        }
        //catch(error0 exc){
       //     System.out.println(exc.eooro0());
       // }
        catch(ArithmeticException exc){     //捕获除数为0的异常
            System.out.println("发生异常，除数为0");
        }
        catch(NumberFormatException exc){   //捕获数字格式异常
            System.out.println("数字格式异常");
        }
        catch(Exception exc){
            System.out.println("通用异常");
        }
    }
}
