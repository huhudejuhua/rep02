package finaltest;

public class Sushu {
    public static void main(String[] args) {
       int i,s=0;
       for(i=101;i<201;i++){
           if(fn(i)==true){
               System.out.print(i+" ");
               s++;
           }
       }
        System.out.println();
        System.out.println("素数个数："+s);
    }
    public static boolean fn(int i){
        int j;
        for(j=2;j<i/2;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
