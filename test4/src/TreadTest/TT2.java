package TreadTest;

public class TT2 {
    public static void main(String[] args) {
        Road water=new Road();
        Thread cat=new Thread(water);
        cat.setName("cat");
        Thread dog=new Thread(water);
        dog.setName("dog");
        cat.start();
        dog.start();
    }
}
