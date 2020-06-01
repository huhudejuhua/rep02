package finaltest;

import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i;
        int max=0,mindex=0;

        for(i=0;i<5;i++){
            a[i]=in.nextInt();
            if(i==0){
                max=a[i];
                mindex=i;
            }
            else{
                if(a[i]>max){
                    max=a[i];
                    mindex=i;
                }
            }
        }
        System.out.printf("最大值为%d,索引号为%d",max,mindex);
    }
}
