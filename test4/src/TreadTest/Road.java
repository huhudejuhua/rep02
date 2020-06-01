package TreadTest;

public class Road implements Runnable {
    int water=20;
    public synchronized void run(){
        while(true){
            if(water<=0)
                break;
            water=water-1;
            System.out.println(Thread.currentThread().getName()+"喝水,还剩水量："+water);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException exc){}
        }
    }
}
