package TreadTest;

public class TT1 {
    public static void main(String[] args) {
        SpeakElephant el=new SpeakElephant();
        SpeakCar car=new SpeakCar();
        car.setPriority(Thread.MAX_PRIORITY);
        el.start();
        car.start();
        for(int i=0;i<10;i++){
            System.out.println("主人"+i+"  ");
        }
    }
}
