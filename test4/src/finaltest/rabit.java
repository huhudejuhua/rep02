package finaltest;

import java.util.Scanner;

public class rabit {
    public static void main(String[] args) {
        int i;
        int sum=1;
        for(i=1;i<=24;i++) {
            System.out.printf("第%d月，兔子%d只\n", i, fn(i));
        }
    }

    public static int fn(int n) {
        if(n!=1&&n!=2) {
            if(n!=3) {
                return fn(n-1)+fn(n-2);
            }
            return 2;
        }
        else return 1;
    }
}
