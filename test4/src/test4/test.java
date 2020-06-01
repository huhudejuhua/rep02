package test4;

public class test {
    public static void main(String[] args){
        int i;
        postgraduate[]  xuesheng=new postgraduate[]{
         new postgraduate("kiss","ruanjian",80),
         new postgraduate("pit","ruanjian",42),
         new postgraduate("rust","ruanjian",77),
         new postgraduate("clous","ruanjian",98)
        };

        for(i=0;i<4;i++){
            System.out.println("学生"+xuesheng[i].name+"成绩等级为"+xuesheng[i].getlevel());
        }
    }
}
