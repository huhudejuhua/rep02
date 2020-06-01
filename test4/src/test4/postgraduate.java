package test4;

public class postgraduate extends student {
    postgraduate(String name,String kecheng,int score){
        this.name =name;
        this.kecheng =kecheng;
        this.score =score ;
    }
    String  getlevel() {
        if(score>=90)
            return "A";
        else if(score >=80)
            return "B";
        else if(score >=70)
            return "C";
        else if(score >=60)
            return "D";
        else
            return "E";
    }
}
