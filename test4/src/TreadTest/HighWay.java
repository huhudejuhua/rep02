package TreadTest;

public class HighWay implements Runnable {
    Thread driver;
    void setDriver(Thread x){
        driver=x;
    }
    public void run(){
        if(Thread.currentThread().getName().equals("司机")){
            System.out.println("我在高速路上开车");
            System.out.println("好累啊，想睡一会");
            System.out.println("ZzzZzzZzz");
            try{
                Thread.sleep(1000*60*60);
            }
            catch(InterruptedException exc){
                System.out.println("被警察叫醒了");
            }
            System.out.println("继续开车");
        }
    }
}
