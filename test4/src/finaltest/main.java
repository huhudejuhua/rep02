package finaltest;

public class main {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<10;i++){
            for(j=1;j<i+1;j++){
                System.out.printf("%d*%d=%d ",j,i,i*j);
            }
            System.out.println();
        }
    }
}
