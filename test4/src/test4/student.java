package test4;

abstract class student {
    String name;
    String kecheng;
    int score;

    void setname(String name){
        this.name=name;
    }
    void setkecheng(String kecheng){
        this.kecheng=kecheng;
    }
    void setscore(int score){
        this.score =score ;
    }
    abstract String getlevel();
}
