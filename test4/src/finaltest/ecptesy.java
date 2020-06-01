package finaltest;

import java.util.Scanner;

public class ecptesy {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        try {
            if(b==0){
                throw new IOE();
            }
        }
        catch (IOE ioe) {
            System.out.println("0做除数无意义!");
        }
        System.out.println("the result is "+(a/b));
    }
}
