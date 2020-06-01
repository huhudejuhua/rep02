package test4;

public class undergaduate extends student  {

    undergaduate(String name,String kecheng,int score){
        this.name =name;
        this.kecheng =kecheng;
        this.score =score ;
    }
    String getlevel() {
        if(score>=80)
            return "A";
        else if(score >=70)
            return "B";
        else if(score >=60)
            return "C";
        else if(score >=50)
            return "D";
        else
            return "E";
    }
}
